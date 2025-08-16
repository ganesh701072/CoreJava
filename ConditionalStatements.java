package org.test;

public class ConditionalStatements {
	public static void main(String[] args) {
		int a=25;
		if (a>=18) {
			System.out.println("he is eligible to vote");
			
		}
		else {
			System.out.println("he is not eligible to vote");
		}
		int b=40; int c = 12; int d = 4;
		if (b>c && b>d) {
			System.out.println("b is greater");
		}else if (c>d && c>b) {
			System.out.println("c is greater");
		}else
			System.out.println("d is greater");
	}

}
