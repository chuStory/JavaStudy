package chapter03;

import java.util.Scanner;

public class 실습문제31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
//		String str = scanner.next();
//		한행을 모두 입력 처리 (+Line)
		String str = scanner.nextLine();
		System.out.println("문자열의 개수: "+str.length());

		if (str.length()%2 == 0) {
			System.out.println("문자열의 개수는 짝수이다.");
		}else {
			System.out.println("문자열의 개수는 홀수이다.");
		}
	}
}