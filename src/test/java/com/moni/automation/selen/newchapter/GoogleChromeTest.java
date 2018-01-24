package com.moni.automation.selen.newchapter;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleChromeTest {

	private WebDriver webDriver;
	private SeleniumHq seleniumHq;
	private Documentation documentationPage;

//	@Before
//	public void setUp() throws Exception {
//		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
//		webDriver = new FirefoxDriver();
//		webDriver.manage().window().maximize();
//		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}

//	@After
//	public void tearDown() throws Exception {
//		webDriver.quit();
//	}

//	@Test
//	public void testOne() throws Exception {
//		SeleniumHq seleniumHq = new SeleniumHq(webDriver);
//		Documentation documentPage = seleniumHq.clickDocumentation();
//		WebDriverDocumentation wdDocumentation = documentPage.navigateToWebDriverDocumentation();
//
//		String actualTitle = webDriver.getTitle();
//		String expectedTitle = "Selenium WebDriver — Selenium Documentation";
//		assertEquals(expectedTitle, actualTitle);
//
//	}

	@Test
	public void testOne() throws Exception {
		System.out.println("Test");
	}
}
