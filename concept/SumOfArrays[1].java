package com.dlithe.Operators;

import java.util.Scanner;

public class SumOfArrays
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int sum=0;
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println(sum);
	}
}
//8 4 1 5 8 0 8 9 6 4 2 9 3