package com.dlithe.oops;

interface Test3{
	public void add();
}

class Test4{
	public void sum()
	{
		System.out.println("this is sum method");
	}
}

public class UpcastingAndDownCasting extends Test4 implements Test3
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
System.out.println("this is add method ");
	}
	@Override
	public void sum()
	{
		System.out.println("this is sum method in subclass");
	}
	public static void main(String[] args) 
	{
		Test3 t3=new UpcastingAndDownCasting();//we are creating the obeject of subclass and storing it in super type
		Test4 t4=new UpcastingAndDownCasting();
		t4.sum();
		t3.add();
		//downcast 
		UpcastingAndDownCasting u1=(UpcastingAndDownCasting)t4;
		
	}

}
