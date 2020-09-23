package org.allexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
		WebElement month = driver.findElement(By.xpath("//[@id='month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		for(WebElement op : options) {
			System.out.println(op.getText());
		}
		
	}

}
