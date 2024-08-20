/**
 * from jdk-8 onwards we can use concrete method inside your interface
 * to declare concrete methods inside interface we have to use 2 keywords
 * 1)static -> for static method 
 * 2)default ->for non static method
 * 
 * if you want a concrete method with in the interface which should not be overriden in subclass then you have to declare it with the help of static keyword
 * 
 * why we need static concrete method :
 * depends on programmer requirement
 * 
 */
package com.dlithe.oops;

interface T1
{
	public default void add()
	{
		System.out.println("this is default method");
	}
	public static void sub()
	{
		System.out.println("this is static method");
	}
}
public class JDK8_Interface implements T1
{
	public static void main(String[] args) 
	{
		T1.sub();
		JDK8_Interface j=new JDK8_Interface();
		j.add();
	}
	//if we have default method in interface we cant exterct that property in subclass directly . for that we have to oevrride the method in subclass
	@Override
	public void add()
	{
		System.out.println("this is subclass defination");
	}
	
}
