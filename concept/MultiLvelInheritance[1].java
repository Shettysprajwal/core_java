/**
 * Sub class extracting the properties from super class and that super class is extracting the properties from another super class
 ``		grandfather 
 		   Father
 		    son
 		    
 		    	w1-> message
 		    	w2-> video and audio call
 		    	w3-> payment and meta ai
 */

package com.dlithe.oops;
class W1{
	public void message()
	{
		System.out.println("this is first version of whatsapp");
	}
}
class W2 extends W1
{
	public void audioAndVideo()
	{
		System.out.println("this is secong version of whatsapp");
	}

}
class W3 extends W2
{
	public void paymentAndmetaAI()
	{
		System.out.println("this is Third version of whatsapp");
	}

}
public class MultiLvelInheritance 
{
	public static void main(String[] args) {
		new W1().message();
		System.out.println("______________________");
		W2 w2=new W2();
		w2.audioAndVideo();
		w2.message();
		System.out.println("___________________________");
		W3 w3=new W3();
		w3.message();
		w3.audioAndVideo();
		w3.paymentAndmetaAI();
	}
}
