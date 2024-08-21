/**
 * abstraction : Hiding 
 * hiding the implementation details of the class and exposing only services or behaviours is called as abstraction 
 * abstraction is achieved by using 3 layers
 * 1)object implementation layer
 * 2)object creation layer
 * 3)object utilization layer
 * 
 * generalize all the super class methods and declare as abstract methods in a common super class or super interface and create object implementation layer
 * create object of a class that will create the object of implementation class and upcast it to super class or super interface
 * within the object utilization layer we are utilizing upcasted reference variable that returned by object creation layer to call the generalized method
 * 
 */
package com.dlithe.oops;

interface User
{
	public void transaction();
}
class Web implements User{

	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		System.out.println("this is web class transaction");
	}

}
class ATM implements User{

	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		System.out.println("this is atm class transaction");
	}

}
class Service{
	User u1;
	public User createObject(int pin)
	{
		if(pin == 1234)
		{
			u1=new ATM();
			System.out.println("ATM OBJECT IS CREATED");
			return u1;
		}
		else
		{
			u1=new Web();
			System.out.println("Web class object is reated ");
			return u1;
		}
	}
}
public class Abtraction 
{
	public static void main(String[] args) {
		Service s1=new Service();
		User u=s1.createObject(1234);
		u.transaction();
		
		User u2=s1.createObject(1234567);
		u2.transaction();
	}
}
