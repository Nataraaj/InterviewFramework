package com.generickeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericKeywords {

	private ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();


	public WebDriver getDriver() {
		return driverThreadLocal.get();
	}


	protected void openBrowser() {

	}


	protected void closeBrowser() {
		getDriver().quit();

	}


	protected void click(By locator) {
		try {
			getDriver().findElement(locator).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void input(By locator,String value) {
		try {
			getDriver().findElement(locator).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
