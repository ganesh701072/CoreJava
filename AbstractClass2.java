package org.test;

public class AbstractClass2 extends AbstractClass{
public void empSalary() {
	System.out.println("3LPA");
	
	
}

@Override
	public void empName() {
		System.out.println("ganesh");
	}
@Override
	public void empid() {
		System.out.println("4000");
	}
	public static void main(String[] args) {
		AbstractClass2 ac2=new AbstractClass2();
		ac2.empName();
		ac2.empid();
		ac2.empSalary();
		
	}

}
