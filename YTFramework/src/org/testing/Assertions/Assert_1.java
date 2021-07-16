package org.testing.Assertions;

public class Assert_1
{
 public static void assertionn(String expected,String actual)
 {
	if(expected.equals(actual))
	{
		System.out.println("Assertion is passed");
	}
	else
	{
		System.out.println("Assertion is failed");
	}
 }
}
