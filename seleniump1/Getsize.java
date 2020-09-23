package org.allexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		
		Dimension size = email.getSize();
		
		System.out.println(size);
		int height = size.getHeight();
		System.out.println("heigth "+height);
		int width = size.getWidth();
		System.out.println(width);
		
		Point location = email.getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		
		String cssValue = email.getCssValue("color");
		System.out.println(cssValue);
		String cssValue2 = email.getCssValue("frontsize");
		System.out.println(cssValue2);
	}
}
