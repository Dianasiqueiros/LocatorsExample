package com.diana.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
		
		//open the url in the browser
		driver.get("http://www.facebook.com");
		/*
		//find the element and send the value
		driver.findElement(By.id("email")).sendKeys("dianasiqueirosvea@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("desarmando");
		//accion en un link
		driver.findElement(By.linkText("Forgot account?")).click();
		*/
		//driver.close();
		//checkpoint mediante css selector
		//driver.findElement(By.cssSelector("#email")).sendKeys("hola");
		driver.findElement(By.cssSelector("#pass")).sendKeys("1212");
		
		//customizando la xpath a partir de html
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hola");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
