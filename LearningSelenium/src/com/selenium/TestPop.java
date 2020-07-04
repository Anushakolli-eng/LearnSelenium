package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestPop {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://yssofindia.org/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"specialDiscount\"]/div/p[1]/button")).click();
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/ul/li/div/div/ul[3]/li[2]/a")).click();
		
		
		
	}

}
