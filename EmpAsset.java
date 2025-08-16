package org.newpackage;
import org.test.*;
public class EmpAsset {
	public void empSalary() {
		System.out.println("Emp salary is 10000");
	}
	public static void main(String[] args) {
		EmpDetails a2=new EmpDetails();
		a2.empName();
		EmpAsset a=new EmpAsset();
		a.empSalary();
		EmpAddress a1=new EmpAddress();
		a1.empAddress();
		
	}

}
