package chapter02;

import java.util.Scanner;

public class 실습문제4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2개의 실수 입력>>");
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		
		System.out.println("두수의 덧셈은"+(a+b));
		System.out.println("두수의 뺄셈은"+(a-b));
		System.out.println("두수의 곱셈은"+(a*b));
		System.out.println("두수의 나눗셈은"+(a/b));
		
		scanner.close();
	}

}
