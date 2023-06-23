package chapter02;

import java.util.Scanner;

public class 실습문제10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3자리수 정수 입력(100~999)>>");
		int n = scanner.nextInt();
		
//		100자리수 : 나누기 100의 몫
//		10의자리수 : 나누기 100의 나머지를 10으로 나눈 몫
//		1의자리수 : 나누기 100의 나머지를 10으로 나눈 나머지
		int hundred = n/100;//100의자리수
		int hundredRest = n%100;
		int ten = hundredRest/10;//10의자리수
		int one = hundredRest%10;//1의자리수

		int sum = hundred+ten;
		int multiply = ten*one;

		System.out.println("100의 자리와 10의 자리의 합은"+sum);
		System.out.println("10의 자리와 1의 자리의 곱은"+multiply);
		
		scanner.close();
	}

}
