package org.allexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkscount {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("selenium",Keys.ENTER);
		
		Actions a = new Actions(driver);
		List<WebElement> links = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		
		for (int i = 0; i < links.size(); i++) {
		//	Actions a = new Actions(driver);
			WebElement cl = links.get(i);
			a.contextClick(cl).perform();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			}
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> li = new LinkedList<String>();
		li.addAll(windowHandles);
		for (int j = 0; j < li.size(); j++) {
			driver.switchTo().window(li.get(j));
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			}
			
			
	}}
		
		
		
	


