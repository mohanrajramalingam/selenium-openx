package com.moni.automation.selen.newchapter;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowEx {

	private WebDriver webDriver;
	private JavascriptExecutor jse;
	String window1, window2;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		jse = (JavascriptExecutor) webDriver;
	}

	@Test
	public void testMW() {
		openFirstWindow();
		openSecondWindow();
		System.out.println("Number of windows handle: " + webDriver.getWindowHandles().size());
        webDriver.switchTo().window(window2);
        webDriver.switchTo().window(window1);
        webDriver.switchTo().window(window2);
        webDriver.quit();
	}

	private void openFirstWindow() {
		webDriver.get("http://www.google.com");
		window1 = webDriver.getWindowHandle();
        System.out.println("First window handle: " + window1);
	}

	private void openSecondWindow() {
		jse.executeScript("window.open('http://www.bing.com/');");
		window2 = webDriver.getWindowHandle();
        System.out.println("First window handle: " + window2);
	}

}
