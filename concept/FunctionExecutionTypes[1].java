package com.dlithe.Operators;

public class FunctionExecutionTypes {
	public static void main(String[] args) {
		int a=10,b=10;
		int d=add(a,b);
		sq(d);
		rec(3);
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		sq(c);
		return c;
	
	}
	public static void sq(int n)
	{
		System.out.println(n*n);
	}
	public static void rec(int n)
	{
		if(n>=0)
		{
			System.out.println(n);
		}
	
	}
}
