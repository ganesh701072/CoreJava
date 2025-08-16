package org.test;
import org.newpackage.*;

public class EmpDetails extends EmpAddress{
	
	public void empName  (){
		System.out.println("Emp NAme is Ajay");
		
	}
	public static void main(String[]args) {
		
		EmpDetails name=new EmpDetails();
		name.empName();
		name.empAddress();
		
	}
	
	
}


