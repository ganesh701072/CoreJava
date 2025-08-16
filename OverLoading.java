package org.test;

public class OverLoading {
	public void userDetails(int a) {
		System.out.println("userid " + a);
	}
	public void userDetails(String a1,int a2, long a3) {
		System.out.println("username"+ a1+ "\nuserage "+a2 + "\nusernum "+a3);
	}
	public void userDetails(String a4, long a5, int a6) {
		System.out.println("userrole"+a4 + "\nuserlpa "+ a5 + "\nuserrating "+a6);
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.userDetails(4000);
		o.userDetails(" ganesh",  25,  99999999999l);
		o.userDetails(" engineer",  240000l,  70);
	}

}
