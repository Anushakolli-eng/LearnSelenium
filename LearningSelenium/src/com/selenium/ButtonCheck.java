package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonCheck {

	public static void main(String[] args) 
	
	{
System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[contains(@type, 'radio')][1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> chk = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Iterator<WebElement> itr = chk.iterator(); 
		
		itr.next().click();
		 while (itr.hasNext() )
		 {
			 
		   //if(!itr.next().isSelected())
		   itr.next().click();
	}

}
}
