package org.allexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {
	
	public static void main(String[] args) throws InterruptedException {
		String month ="Nov 2020";
		String date = "20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(2000);
		
		while(true) {
		String text = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		
		if (text.equals(month)) {
			break;
		}	
		else {
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		}
		}
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		WebElement month1 = driver.findElement(By.className("react-datepicker__month-select"));
		
		Select s= new Select(month1);
		s.selectByValue("3");;
		WebElement month2 = driver.findElement(By.className("react-datepicker__year-select"));
		Select s2 =  new Select(month2);
		s2.selectByValue("2020");
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();

		Select s4= new Select(month1);
		s4.selectByValue("3");;
		WebElement month3 = driver.findElement(By.className("react-datepicker__year-select"));
		Select s3 =  new Select(month3);
		s3.selectByValue("2020");
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[80]")).click();
		
		
		
	
		
	}

}
