/**
 * Inheritance: Extracting properties from super class to subclass
 * -> minimum 2 classes
 * ->super class/parent class / base class: it is a class from where we are extracting the property 
 * ->sub class/derived class/ child class:it is a class where are taking the properties from super class
 * ->extends: keyword
 * -> when ever we are creating the object of super class we can only access super class properties (data member or function)
 * ->when ever we are creating the object of subclass we can access both super and sub class peoperties 
 * 
 * TYPES OF INHERITANCE
 * 1)single /simple inheritance 
 * 2)multi level 
 * 3)multiple 
 * 4)hierarchical 
 * 5)hybrid
 */

package com.dlithe.oops;

class ParentClass{
	int a=20;
	public void display()
	{
		System.out.println("this is parent class and containing one varibable called a: "+a);
	}
}
public class InheritanceInJava extends ParentClass
{
	int a=20;
	public void display1()
	{
		System.out.println("this is child class and containing one varibable called a: "+a);
	}
	public static void main(String[] args)
	{
		new ParentClass().display();
//		new ParentClass().display1();
		new InheritanceInJava().display1();
		new InheritanceInJava().display();
	}
}
