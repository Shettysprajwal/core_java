/**
 * encapsulation is nothing but declaring data members and function memebers wrapping in to single unit 
 * 
 * How To Achieve the encapsulation in java 
 * 
 *  - declaring data members as private and grant the access through getter and setters method is called as encapsulation
 *  - getter methods will return current value of the data 
 *  - return type of a getter method depends on the data type of the data member who's value will be returned 
 *  - setter method updates the value of data member 
 *  - return type of setter method is usally void because it will not return any value 
 *  
 *  encapsulation is used to provide security for the data members againest invalid values
 */
package com.dlithe.oops;
class Testing{
	protected String email="abc@gmail.com";
	private String pw="123345";
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}

public class EncapsulationInJava 
{
	public static void main(String[] args)
	{
		Testing t1=new Testing();
		System.out.println(t1.email);
		System.out.println(t1.getEmail());
		t1.setEmail("xyz@gmail.com");
		System.out.println(t1.getEmail());
	}
}
