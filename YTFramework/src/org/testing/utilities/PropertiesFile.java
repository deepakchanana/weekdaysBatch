package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// it will load the properties file
// properties is also a class in java
// it will return the object of Properties class
public class PropertiesFile 
{
 public static Properties loadProperties(String path) throws IOException
 {
	 File f=new File(path); // connection establish
	 FileInputStream fi=new FileInputStream(f);
	 Properties pr=new Properties();
	 pr.load(fi);
	 return pr;
 }
}
