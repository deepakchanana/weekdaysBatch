package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void testcase1() throws IOException
	{
     Login login=new Login(driver, pr);
     login.signin("deepakdeep1992","password1");
     Screenshot.takeScreenshot(driver,"D://Screenshots/first.png");
	 LogsCapture.takeLogs("login successfully for TC1","TC1");
	}

}
