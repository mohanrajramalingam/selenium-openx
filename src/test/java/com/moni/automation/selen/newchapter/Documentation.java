package com.moni.automation.selen.newchapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Documentation {

	private WebDriver webDriver;
	
	Documentation(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public WebDriverDocumentation navigateToWebDriverDocumentation() {
		webDriver.findElement(By.linkText("Selenium WebDriver")).click();
		return new WebDriverDocumentation(webDriver);
	}
}
