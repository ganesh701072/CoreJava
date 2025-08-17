package org.java;

public class ArrayProgram {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[4]);
		
		//forloop
		System.out.println("forloop");

		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		
		//enhanced for loop
		System.out.println("enhanced forloop");
		for (int x:a) {
			System.out.println(x);
		}
		int b[][]=new int[2][3];
		b[0][0]=60;
		b[0][1]=70;
		b[0][2]=80;
		b[1][0]=90;
		b[1][1]=100;
		b[1][2]=110;
		
		//for loop
		System.out.println("forloop");
		
		for (int i=0; i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enhanced forloop");
		for(int [] x1:b) {
			for(int y1:x1) {
				System.out.print(y1+" ");
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

}
