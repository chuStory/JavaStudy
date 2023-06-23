package chapter03;

import java.util.Scanner;

public class 실습문제3 {
	public static void main(String[] args) {
		int fare;
		int income = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("요금을 입력하세요: ");
		fare = scanner.nextInt();
		income += fare;
		}
		System.out.println("총수입: "+income);
		scanner.close();
		}
	}