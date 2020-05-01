package com.diana.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		
		//regular expresion css
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		
		//xpath
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("diana");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
		driver.findElement(By.className("signinbtn")).click();
	}
}
