package org.kh.site;

public class Operation4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(++a);	//전위 증가 연산
		System.out.println(b++);	//후위 증가 연산 10이 출력되고 11이 됨
		System.out.println(--a);	//전위 감소 연산 (11-1)
		System.out.println(b--);	//후위 감소 연산 11이 출력되고 (11-1) 
		System.out.println(b);
	}

}
