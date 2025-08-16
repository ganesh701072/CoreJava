package org.test;

public class OverRiding2 extends OverRiding {
	@Override
	public void compName(String a) {
		// TODO Auto-generated method stub
		super.compName(a);
	}
public static void main(String[] args) {
	OverRiding2 or2=new OverRiding2();
	or2.compName("company name in 2025 is buntv");
}
}
