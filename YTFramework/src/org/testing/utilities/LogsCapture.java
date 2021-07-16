package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLogs(String msg,String className)
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger logger=Logger.getLogger(className);
		logger.info(msg);
	}

}
