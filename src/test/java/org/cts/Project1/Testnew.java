package org.cts.Project1;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testnew {
	 static WebDriver driver;
	@BeforeClass
	private void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Project1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	private void Close() throws InterruptedException {
Thread.sleep(5000);
		driver.quit();
	}
@BeforeMethod
private void Starttime() {
Date d = new Date();
System.out.println("Start time" +d);
}
@AfterMethod
private void EndTime() {
Date d = new Date();
System.out.println("End Time" +d);
}
@Test
private void Login() throws InterruptedException {
	wait(5000);
driver.get("https://www.facebook.com/");
WebElement a = driver.findElement(By.id("email"));
a.sendKeys("pradheepsmp@gmail.com");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
		e.printStackTrace();
}
WebElement b = driver.findElement(By.id("pass"));
b.sendKeys("97867485");
SoftAssert b1 = new SoftAssert();
b1.assertEquals(b.getAttribute("value"), "97867485");
WebElement c = driver.findElement(By.id("loginbutton"));
c.click();
b1.assertAll();
}
}

