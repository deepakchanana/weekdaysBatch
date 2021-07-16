package org.testing.Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
    public ChromeDriver driver;
    public Properties pr;
	@BeforeMethod
	public void init() throws IOException
	{
		// browser open + url hit + maximize
       driver=new ChromeDriver();
		pr=PropertiesFile.loadProperties("../YTFramework/Object.properties");
	}
	@AfterMethod
	public void close()
	{
		// browser close
	}
}
