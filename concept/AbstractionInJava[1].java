package com.dlithe.oops;
/**
 * ABSTRACT:Incomplete
 * Abstract method : it is type of method which doesn't have method defination but it will contain only declaration 
 * abstract : keyword
 * abtrsct classes : when ever we are declaring any classes with abstract keyword then we will call it as abtract class
 * abstract method can be declared with the help of abstract keyword
 * if a class containing atleast one abtract method then the calss will be convered into abstract class
 *  
 *  type of classes 
 *  1)abstract :here method does not conatins method definition 
 *  2) concrete class/full class : a class which is containing only complete methods(both method declartaion and defination)
 *  
 *  Rule of Abstract:
 *  if a class inherits from abstract class then subclass must override the abstract methods present in super class



abstract class First{
	public abstract void add();
}

public class AbstractionInJava extends First
{


	public static void main(String[] args) {

	}

	@Override
	public void add() {
		System.out.println("this is overriden");

	}
}
 */
abstract class Amazon1
{
	abstract public void order(String prod_name,long prod_id);
	public void add(int a,int b)
	{
//		a=10;b=10;
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
public class AbstractionInJava extends Amazon1
{
	public static void main(String[] args)
	{
		AbstractionInJava a1=new AbstractionInJava();
		a1.order(null, 0);
		a1.add(1, 1);
		Amazon1.sub(1, 12);
	}

	@Override
	public void order(String prod_name, long prod_id) {
		// TODO Auto-generated method stub
		System.out.println("this is from abstract class");
		
	}	
}