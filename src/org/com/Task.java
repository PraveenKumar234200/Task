package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task {
	static WebDriver driver;
	@Test(priority = 1)
	public static void LoginWithValidCredentials() {

		driver=new ChromeDriver();
		driver.get("https://app.germanyiscalling.com/common/login/");//To open the website
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.id("username"));
		Email.sendKeys("Praveenkumarp2342001@gmail.com");//SendKeys is used to enter a word 
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Praveen@23");
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();

	}
	@Test(priority = 2)
	public static void LoginWithInValidCredentials() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://app.germanyiscalling.com/common/login/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("Praveenkumarp234200@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Praveen@23");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}
	@Test(priority = 3)
	public static void LoginWithEmptyField() {
		driver=new ChromeDriver();
		driver.get("https://app.germanyiscalling.com/common/login/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
	@Test(priority = 4)
	public static void LoginWithSpecialCharacters() {
		driver=new ChromeDriver();
		driver.get("https://app.germanyiscalling.com/common/login/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("Praveen23#$@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Praveen$#@*&");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
}
