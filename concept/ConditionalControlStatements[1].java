package com.dlithe.Operators;
/**
 * 1)simple if
 * 2)if else...
 * 3)Nested if 
 * 4)if else if..
 * 5)switch statements
 */
public class ConditionalControlStatements
{
	public static void main(String[] args)
	{
//WAP TO CHECK THE GIVEN NUMBER IS +VE OR NOT
//		int m1=-10;
		/*
		 *   Syntax:
		 * 	if(condition)
		 *	{
		 *	codes
		 *	}
		 
		if(m1>=0)
		{
			System.out.println("Given Number is positive");
		}
		*/
		
		/*
		 * 	2) if else
		 * 
		 *   Syntax:
		 *   if(condition)
		 *   {
		 *   		//code
		 *   }
		 *   else
		 *   {
		 *   		//code
		 *   }
		 
		if(m1>=0)
		{
			System.out.println("given number is +ve");
		}
		else
		{
			System.out.println("Given number is -ve");
		}
		*/
//		int n1=10,n2=9,n3=4;
		/*if(n1>=0)
		{
			if(n2<10)
			{
				System.out.println("given number is +ve And single digit number");
			}
		}*/
		
		//4)if else if:
		int marks=70;
		if(marks>=90 && marks<=100)
		{
			System.out.println("A+");
		}
		else if(marks >=75 && marks<90)
		{
			System.out.println("A");
		}
		else if(marks >= 60 && marks <75)
		{
			System.out.println("B");
		}
		else if(marks >35 && marks <60 )
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
		
		//5) SWITCH 
		/*
		 * switch(ch)
		 * {
		 *	case 1:statement 
		 *			break;
		 *	case 2:statement 
		 *			break;
		 *	case 3:statement 
		 *			break;
		 *	'''''''''''''''''''''''
		 *	default :
		 *				print
		 *
		 *}
		 */
	}
}
