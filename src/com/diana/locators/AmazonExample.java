package com.diana.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//xpath example(custome)
public class AmazonExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.mx");
		
		/*
		//xparh sintax
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("cuchara");
		driver.findElement(By.xpath("//*[@value='Ir']")).click();
		*/
		
		//css sintax
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("tenedor");
		driver.findElement(By.cssSelector("input[value='Ir']")).click();
		
	}

}
