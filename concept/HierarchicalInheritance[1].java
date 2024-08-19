/**
 * two or more subclasses accessing properties from one super class
 * Account :
 * Current : 0.5*Amount=
 * Saving
 * Salary 
 * 
 */
package com.dlithe.oops;

class Account{
	String accHolder_name;
	long acc_number;
	String branch;
	String acc_type;
	public Account(String acc_name, long acc_number, String branch,String acc_type)
	{
		super();
		this.accHolder_name = acc_name;
		this.acc_number = acc_number;
		this.branch = branch;
		this.acc_type=acc_type;
		System.out.println("Account class");
	}
		
}
class Current extends Account
{

	public Current(String acc_name, long acc_number, String branch, String acc_type) {
		super(acc_name, acc_number, branch, acc_type);// super statement is used to call super class constructor 
	System.out.println("Current class");
	}
	
}
class Savings extends Account{

	public Savings(String acc_name, long acc_number, String branch, String acc_type) {
		super(acc_name, acc_number, branch, acc_type);
		// TODO Auto-generated constructor stub
		System.out.println("This is Savings class");
	}
	
}
public class HierarchicalInheritance
{
public static void main(String[] args) {
	Current c=new Current("xyz",123456789,"abc","Current");
	Savings s=new Savings("xyz",123456789,"abc","Savings");
}
}
