/***
 * Array is a container to store the group of elements 
 * it is index based 
 * Array containes homogeneous elements
 * Array size is fixed we cannot increse or decrease the array size
 * initial array index :0
 * ends with :n-1
 * 
 * 1)Array declaration:
 * data_type[] variable;
 * ex : int[] a;
 * 
 * 2)Creation of an array 
 * array_name=new data_type[size];
 * 
 * 3)array declaration and creation:
 * data_type[] name=new data_type[size];
 * 
 * int[] a=new int[8];
 */

package com.dlithe.Operators;

public class ArraysInJava {
	public static void main(String[] args) {
		int []a=new int[7];
//		a[0]=5;
//		a[1]=0;
		int b=1;
for(int i=0;i<a.length;i++)
{
	
	a[i]=b;
	b++;
	System.out.println(a[i]);
}
	}
}
