package com.moni.automation.selen.newchapter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHq {

	private WebDriver webDriver;
	private String baseUrl;

	SeleniumHq(WebDriver webDriver) {
		this.webDriver = webDriver;
		webDriver.manage().window().maximize();
		baseUrl = "http://www.seleniumhq.org";
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get(baseUrl + "/");
		System.out.println(webDriver.getCurrentUrl());
	}

	public Documentation clickDocumentation() {
		webDriver.findElement(By.linkText("Documentation")).click();
		return new Documentation(webDriver);
	}
}
