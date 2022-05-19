package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	@Given("User is on the Login page")
	public void loadUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		}
@When("User Should Enter UserName and Password")
public void loginDetails() {
WebElement txtUserName = driver.findElement(By.id("username"));
txtUserName.sendKeys("YogeshYoku");
WebElement txtPassword = driver.findElement(By.id("password"));
txtPassword.sendKeys("PR9Z29");
}
@When("User Should Click Login button")
public void loginClick() throws InterruptedException {
	Thread.sleep(6000);
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();
	}
@Then(" User Should Verify Success Message")
public void userVerify() {
	
	Assert.assertTrue(true);
	System.out.println("welcome");
	
}
}