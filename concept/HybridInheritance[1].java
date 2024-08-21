/***
 * simple + multilevel
 * multilevel+hierarchical 
 * simple+heirarchical
 * 
 * it is combination of any two inheritance concept 
 */
package com.dlithe.oops;

class Amazon{
	String Pro_name;
	long prod_id;
	
	public Amazon(String pro_name, long prod_id) {
		super();
		Pro_name = pro_name;
		this.prod_id = prod_id;
	}

	public void order()
	{
	
		System.out.println("order placed successfully");
	}
}
class Dress extends Amazon{

	public Dress(String pro_name, long prod_id) {
		super(pro_name, prod_id);
		System.out.println("This is Dress Class");
	}
	
}
class MensCollection extends Dress{

	public MensCollection(String pro_name,long prod_id) {
		super(pro_name, prod_id);
		// TODO Auto-generated constructor stu
		System.out.println("this is mens class");
	}
	
}
class Home extends Amazon{

	public Home(String pro_name, long prod_id) {
		super(pro_name, prod_id);
System.out.println("this is home class");
	}
	
}
class Electronic extends Amazon{

	public Electronic(String pro_name, long prod_id) {
		super(pro_name, prod_id);
		// TODO Auto-generated constructor stub
		System.out.println("Electronic class");
	}
	
}
public class HybridInheritance
{
public static void main(String[] args) {
	MensCollection m1= new MensCollection("shirt",1001);
	m1.order();
	System.out.println("________________________________");
	Electronic e1=new Electronic("AC",1002);
	e1.order();
}
}
