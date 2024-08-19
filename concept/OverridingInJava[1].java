/**
 * method overriding : sub class is accessing the properties form super class and we can chnage the definations of the method in subclass with out modifing the method declaration
 * 
 */
package com.dlithe.oops;
class Parent1
{
	public void display()
	{
		System.out.println("This is Parent class display method");
	}
}
public class OverridingInJava extends Parent1
{
	@Override
	public void display()
	{
		System.out.println("This is  OverridingInJava class display method");
	}

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.display();//we can access super class method
		OverridingInJava p1 = new OverridingInJava();
		p1.display();// we can see the overriden content
	}
}
