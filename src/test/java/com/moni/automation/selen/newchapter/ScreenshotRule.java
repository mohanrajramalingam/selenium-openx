package com.moni.automation.selen.newchapter;

import java.io.FileOutputStream;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotRule implements MethodRule {

	private WebDriver webDriver;

	public ScreenshotRule(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public Statement apply(final Statement statement, final FrameworkMethod arg1, final Object arg2) {
		return new Statement() {

			@Override
			public void evaluate() {
				try {
					statement.evaluate();
				} catch (Throwable throwable) {
					captureScreenshot(arg1.getName());
					try {
						throw throwable;
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			private void captureScreenshot(String name) {
				 try {
	                    FileOutputStream out = new FileOutputStream("c:/test1/" + name + ".png");
	                    out.write(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES));
	                    out.close();
	                } catch (Exception e) {
	                    //If the screenshot fails no need to interrupt the tests
	                }
			}

		};
	}

}
