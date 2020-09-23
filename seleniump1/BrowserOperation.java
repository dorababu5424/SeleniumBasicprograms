package org.allexamples;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperation {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension(500, 5000);
		driver.manage().window().setSize(d);
		
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		
		
	}

}
