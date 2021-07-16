package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	ChromeDriver driver; // global
	Properties pr; // global
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void signin(String username,String password)
	{
  WebElement login=  driver.findElement(By.xpath(pr.getProperty("login_button")));
		login.click();
	}
}
