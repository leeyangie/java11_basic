package org.kh.site2;
//논리연산자 : &&, ||, !
public class Operation6 {
	public static void main(String[] args) {
		int a = 26;
		int b = 28;
		int c = 27;
		System.out.println("a > b && b > c : "+(a > b && b > c));
		System.out.println("a < b && b > c : "+(a < b && b > c));
		System.out.println("a < b && b < c : "+(a < b && b < c));
		System.out.println("a > b && b < c : "+(a > b && b < c));
		// and 모든 입력이 true 일 경우 출력이 true
		// or 어느 하나라도 입력이 true면 출력이 true
		// not 단항 연산자, 입력이 true -> false, false -> true
		System.out.println(!(a > b));
	}

}
