package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i; //선언only
		long l;	//선언only
		i = 30; //초기화
		l = 40L;	//초기화
		System.out.println("b="+b); 
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		//b = 130;	//Overflow
		//b = -130	//Underflow
	}

}
