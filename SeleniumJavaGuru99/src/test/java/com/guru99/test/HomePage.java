package com.guru99.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePage {
	
	WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\KIIT\\\\Desktop\\\\chromedriver-win64\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/v4/");
	}
	
	@Test
	public void verifyLogin() {
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='uid']"));
		
		userName.sendKeys("mngr525477");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		
		passWord.sendKeys("ypupuze");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Test Case has been excuted successfully");
		driver.quit();
	}
	
	
	

}
