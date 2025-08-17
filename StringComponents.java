package org.java;

public class StringComponents {
	public static void main(String[] args) {
		String s = new String("welcome to java");
		String sa = new String("welcome to java");
		StringBuffer q = new StringBuffer("welcome ");
		StringBuffer d = new StringBuffer("to java");
		System.out.println(s);
		
		int l=s.length();
		System.out.println(l);
		
		boolean b=s.startsWith("w");
		System.out.println(b);
		boolean b1=s.startsWith("Welcome");
		System.out.println(b1);
		boolean b2=s.endsWith("java");
		System.out.println(b2);
		
		String s1=s.toUpperCase();
		System.out.println(s1);
		
		String s2=s.toLowerCase();
		System.out.println(s2);
		
		int va=System.identityHashCode(s);
		System.out.println(va);
		int va1=System.identityHashCode(sa);
		System.out.println(va1);
		StringBuffer va2=q.append(d);
		
		int va3=System.identityHashCode(va2);
		System.out.println(va3);
		int va4=System.identityHashCode(q);
		System.out.println(va4);
		int va5=System.identityHashCode(d);
		System.out.println(va5);
	}

}
