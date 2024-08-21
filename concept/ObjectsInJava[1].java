/**
 * Object: Real Time Entity 
 * comes under class
 * Memory allocation 
 * How to create object: new class_name();
 * when we required objects : 
 */
package com.dlithe.oops;

public class ObjectsInJava 
{
	public static void main(String[] args) 
	{
		//static to static present in same class : direct call
		int a=10, b=20;
		//		System.out.println(a);
		add(a,b);
		//static to static from different class : classname.member_name
		N1.add(a, b);
		//non-static to static method call in a same class:
		ObjectsInJava o1=new ObjectsInJava();
		o1.sub(a,b);
		o1.mul(a, b);
		System.out.println(o1);//object class

		//		new ObjectsInJava().mul(a,b);
		//calling non static method from static method present in different class
		new N1().sub(a,b);

	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);

	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
		//calling non static to non static : direct call
		mul(a,b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}

}
class N1{
	public static void add(int a,int b)
	{
		System.out.println("This is N1 Class "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("This is N1 Class Substraction method"+(a-b));
	}
}
