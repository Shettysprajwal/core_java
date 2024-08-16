/***
 * function are block of codes written for reusability and modularity
 * 		Function declaration : access_specifier  modifier  return_type  function_name(parameters)
 * 								{
 * 										//codes
 * 								}
 * 	access_specifier:
 * public : accessability : from any file/package/folder
 * default : package_level : accessabiloty with in package
 * private : with in the file
 * protected : block
 * 
 *  
 *  modifiers: 
 *  static : 
 *  -> it is a keyword 
 *  -> when ever we are accessing the data from static no need of object creation 
 *  -> here only one copy of the code will be stored.
 *  -> the value will be same for all the objects  
 *  
 *  non-static 
 *  -> for non static we dont have any keyword 
 *  -> the value will be changing from one object to another
 *  -> it will store multiple copy of same element/object
 *  -> to access not static elements we required objects 
 *  
 *  Return TYPE:
 *  void : which is not returning any value
 *  as a return type i can use primitive and non primitive datatypes 
 *  
 *  
 */
package com.dlithe.Operators;

public class FunctionsInJava 
{
	static int a9=10;

	public static int add(int a ,int b)// called function 
	{
//		System.out.println(a+b);
		return (a+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		int a=10,b=5,a1=11;
		System.out.println(add(a,b));
		int res=add(a1,b);//calling function 
		System.out.println(res);
	}

}
