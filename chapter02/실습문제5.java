package chapter02;

import java.util.Scanner;

public class 실습문제5 {
	public static void main(String[] args) {
//		double rate = 1100.0;
//		환율 고정할때 상수 사용(관습적으로 대문자)
		final double RATE = 1100.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
//		double, int 계산 결과를 double로 받음
		double dollar = won/RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		scanner.close();	
	}
}

