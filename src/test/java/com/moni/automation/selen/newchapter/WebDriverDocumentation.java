package com.moni.automation.selen.newchapter;

import org.openqa.selenium.WebDriver;

public class WebDriverDocumentation {

	private WebDriver webDriver;

	WebDriverDocumentation(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriverDocumentation navigateToWebDriverDocumentation() {
		return this;
	}
}
