package chapter03;

import java.util.Scanner;

public class 실습문제22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오>>");
		int n = scanner.nextInt();
		
//		2중 for (행과 열 출력)
//		for (int i = 0; i < n; i++) {
//		감소시키는 로직을 위해서 역으로 진행
		for (int i = n; i > 0; i--) {
//			for (int j = 0; j < n; j++) {
//			하나씩 줄이기 위해서 i값 사용
			for (int j = 0; j < i; j++) {
					System.out.print("*");
			}
//			5개 출력후 엔터 필요
			System.out.println();
		}
	}
}