package com.dlithe.Operators;

public class LoopingSatements 
{
	public static void main(String[] args) {
		/*
		 * 	looping 
		 *  1)for loop 
		 *  2)While loop 
		 *  3)do while loop
		 *  
		 *  
		 *  for(initialization ; condition ; increment/decrement)
		 *  {
		 *  	//code
		 *  }
		 
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		/*
		 * while loop
		 * 
		 * syntax: 
		 * while (condition)
		 * {
		 * 		//code
		 * }
		 * 
		 
		int n=12345;//1+2+3+4+5=15
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		
		*
		*	do..while
		*
		*	do
		*	{
		*		//code
		*	}while(condition);
		*here we will execute the statement at least once 
		*
		*
		*	Nested control loops:
		*	*****
		*	*****
		*	*****
		*	*****
		*	*****
		*/
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=5;j++)//columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
