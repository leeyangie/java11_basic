package org.kh.java;

public class Variable8 {
	public static void main(String[] args) {
		//가변할당 (동적할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당방법
		var num1 = 29.456;
		var num2 = 34;
		var num3 = 'k';
		var num4 = "이연정";
		num1 = 67;
		num1 = 95;
		//num4 = 14;
				
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num4);
	}

}
