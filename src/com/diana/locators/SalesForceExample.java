package com.diana.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		
		driver.findElement(By.id("username")).sendKeys("dianasiqueiros");
		driver.findElement(By.id("password")).sendKeys("123456");	
		//checkpoint mediante xpath
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		//tomar un texto de error e imprimirlo como tu texto
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		
		
		
	}

}
