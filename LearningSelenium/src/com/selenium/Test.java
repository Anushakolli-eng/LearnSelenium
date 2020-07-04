package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
	
	public static void main(String[] args) throws IOException {

		Properties prop=new Properties();
		
		FileInputStream ip= new FileInputStream("D:\\NewAnushaAutomation\\AutomationProject\\LearningSelenium\\Test.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
}
}
