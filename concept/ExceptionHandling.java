/**
 * -exception is an unexpected event which occures at runtime due to unexpected opearation performed by a single line of code
 * - exception handling is writting code which will recover the program from the exception and continues the execution 
 * try:
 * is used to write risky line of codes which is nothing but which are causing exception
 * - if any exception object present in try block if throw that object to a specific catch block
 * 
 * catch:
 * is used to catch the exception which is thrown by try block and it will give alternative code for that
 */
package com.dlithe.oops;

public class ExceptionHandling {
	public static void number(int a)
	{
		try
		{
		int res=500/a;
		System.out.println(res);
		int res1=500+a;//500
		System.out.println(res1);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("a value should not zero");
		}
	}
	public static void main(String[] args) 
	{
	number(1);
	number(5);
	number(0);
	}
}
