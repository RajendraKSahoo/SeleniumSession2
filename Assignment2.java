package com.ibm.seleniumconcepts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		driver.get("http://magento.com");

		WebElement myAccountEle = driver.findElement(By.linkText("My Account"));
		myAccountEle.click();
		
		//Thread.sleep(5000);
		WebElement registerEle= driver.findElement(By.xpath("//button[@type='button']"));
		registerEle.click();
		
		WebElement fnameEle = driver.findElement(By.xpath("//input[@id='firstname']"));
		fnameEle.sendKeys("FirstName");
		
		WebElement lnameEle = driver.findElement(By.xpath("//input[@id='lastname']"));
		lnameEle.sendKeys("LastName");
		
		WebElement emailEle= driver.findElement(By.xpath("//input[@title='Email Address']"));
		emailEle.sendKeys("testemail@gmail.com");
		
		WebElement countryddEle= driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select1 = new Select(countryddEle);
		
		select1.selectByVisibleText("India");
		
		WebElement companyddEle= driver.findElement(By.xpath("//select[@name='company_type']"));
		
		Select select2 = new Select(companyddEle);
		
		select2.selectByVisibleText("Tech Partner");
		
		WebElement roleddEle= driver.findElement(By.xpath("//select[@name='individual_role']"));
		
		Select select3 = new Select(roleddEle);
		
		select3.selectByVisibleText("Technical/developer");
		
		WebElement pwdEle = driver.findElement(By.xpath("//input[@id='password']"));
		pwdEle.sendKeys("Password123");
		
		WebElement confpwdEle = driver.findElement(By.xpath("//input[@id='confirmation']"));
		confpwdEle.sendKeys("Password123");
		
		WebElement agreeEle = driver.findElement(By.xpath("//input[@id='agree_terms']"));
		agreeEle.click();
		
		System.out.println("All input data are entered...");
		
	}

}
