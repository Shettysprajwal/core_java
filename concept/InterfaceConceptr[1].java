/**
 * interface is a type where methods are by default abstract and variables by default static
 * it is impossible to create object of interface 
 * we can create reference variables
 * the class can inherit the properties of an interface only by using keyword implements 
 * the interface where we are inheriting the properties those are known as super interface
 * the class which is implements the interface is called as implementaion class
 * 
 * Rule :
 * if a class is extracting the properties from interface to the class then we have to override all the abstract methods present in that interface
 * 
 * Extracting the properties from one interface to another
 * extends keyword
 * 
 * interface to class
 * implements keyword
 * 
 * class to interface
 * not possible 
 * 
 * class to class
 * extends keyword
 */
package com.dlithe.oops;

interface Test1 //the interfaces cannot extends the properties from object class 
{
	public void add();
}
interface Test extends Test1
{
	public void test();//by default abtract 
	int a=10;
}
public class InterfaceConceptr extends Object implements Test,Test1//this is an example for multiple inheritance which means in java we can access the properties from two or more super interfaces at a time with implements keyword
// when ever we are extending the properties from a class and implementring the properties from interface always we have to write extends keyword and respective class first 
{
	public static void main(String[] args) {
		//System.out.println(Test.a);//justification for static 
		InterfaceConceptr i=new InterfaceConceptr();
		i.test();
		Test i1=i;
		i1.test();
		i1.add();
	}
	@Override
	public void test()
	{
		System.out.println("this is overriden method");
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("this is an add method");
		
	}
}
/**
 * Application of interface 
 * -if we have to develop a class using two super type then we should use interface
 * NOTE: abstract class connot be used here bacause a class cannot extends the properties from two different abstract classes
 * 
 */
