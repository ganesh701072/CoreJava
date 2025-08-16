package org.test;

public class LoopingStatement {
	public static void main(String[] args) {
		for(int i=0 ; i<5;i++) {
			System.out.println(i);
		}
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				System.out.println(j);
			}
		}
		int a=0;
		while(a<=5) {
			System.out.println(a);
			a++;
		}
		int b=900;
		do
		{
			System.out.println(b);
			}while(b<=10);
		}

}
