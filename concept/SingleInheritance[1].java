/**
 * single inheritance is also known as simple inheritance 
 * to achieve this we required 2 classes
 * one sub class inheriting the properties from one super class
 */
package com.dlithe.oops;

class Parent
{
	int v1=10;
	String s1="ABC";
	public void text()
	{
		System.out.println("test() of super class");
	}
}
class Child extends Parent
{
	int z1=2;
	public void display()
	{
		System.out.println("This is subclass dispaly()");
	}
}
//service class
public class SingleInheritance 
{
	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.v1);
		p.text();
		System.out.println("___________________________________");
		Child c=new Child();
		System.out.println(c.v1);
		c.text();
		c.display();
		System.out.println(c.z1);
	}
}
