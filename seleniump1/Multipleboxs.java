package org.allexamples;

import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleboxs {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		List<WebElement> x = driver.findElements(By.className("custom-control-label"));
		for(WebElement w :x) {
			
			if (w.getText().equals("Sports")||w.getText().equals("Reading")) {
				w.click();
			}
			
	
				
			}
		}
		
		
		
	}


