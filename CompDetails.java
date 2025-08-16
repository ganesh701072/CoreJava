package org.test;

public class CompDetails extends EmpDetails{
	public void comName() {
		System.out.println("comp name is tcs");
	}
	public static void main(String[] args) {
		CompDetails c=new CompDetails();
		c.empAddress();
		c.comName();
		c.empName();
	}
	
		
	}