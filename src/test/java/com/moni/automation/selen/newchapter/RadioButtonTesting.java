package com.moni.automation.selen.newchapter;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTesting {

	private WebDriver webDriver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		webDriver.quit();
	}
	
	@Test
	public void testRadioButton() {
		navigateToUrl();
		for(WebElement radioButton : radioGroup) {
			radioButton.click();
			boolean isSelected = radioButton.isSelected();
			if(isSelected)
				System.out.println("selected radio button : " + radioButton.getAttribute("value"));
			}
	}

	List<WebElement> radioGroup;
	
	@Rule
	public ScreenshotRule screenShootRule = new ScreenshotRule(webDriver);
	
	private void navigateToUrl() {
		webDriver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		radioGroup = webDriver.findElements(By.name("software"));
		System.out.println("No of rb : " + radioGroup.size());
	}
}
