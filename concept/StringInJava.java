/**
 * 	-string is a group of characters which we are declared in double quotes
 * 	-we can access the characters or perform any operations on strings only by using predefined methods present in String class
 * 	-internally strinmg values is stored as a character array 
 * 
 * String class Methods:
 * length():it returns the count value of number of characters present in given array 
 * charAt(index):it will returns the character at perticular index
 * indexOf(char): it will return index of given character 
 * indexOf(char,startingIndex): return the index of given character but here it start searching that character from starting index
 * equals(str):it will compare characters of given two strings and returns true if they are equal else return false
 * equalsIgnoreCase(str):it compares characters of given two strings by ignoring the case and return true if they are exactly same else it will return false
 * substring(start_index,end_index):creating one more string with the help of existing string
 */
package com.dlithe.oops;

public class StringInJava {
public static void main(String[] args) {
	int a[]= {2,4,5,7,8};
	int l=a.length;
	String s="qwertty7u8i9oiuthygfd";
	System.out.println(s.length());
	System.out.println(s.charAt(4));
	System.out.println(s.indexOf('t'));
	System.out.println(s.indexOf('t',5));
	String s1=new String("archana@gmail.com");
	String s2="ARCHANA@GMAIL.COM";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s.substring(0,3));
}

}
