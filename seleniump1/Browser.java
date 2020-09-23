package org.allexamples;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String next = s.next();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		if(next.equals("flipkart")) {
		driver.get("https://www.flipkart.com/");
		
		}
		else if (next.equals("amazon")){
			driver.get("https://www.amazon.in/");
		}
		else {
			driver.get("https://www.snapdeal.com/");
		}
		
	}

}
