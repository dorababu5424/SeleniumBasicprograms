package org.allexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeysoperatiosn {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement x = driver.findElement(By.id("email"));
		x.sendKeys("dorababu");
		
		WebElement y = driver.findElement(By.id("pass"));
		x.sendKeys(Keys.CONTROL,"ac");
		y.sendKeys(Keys.CONTROL,"v");
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		boolean log = logo.isDisplayed();
		if (log==true) {
			System.out.println("is displayed");
		}
		driver.quit();
		
	}
}
