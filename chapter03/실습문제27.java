package chapter03;

import java.util.Scanner;

public class 실습문제27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요: ");
		int n = scanner.nextInt();
		
		System.out.print("[");
		for (int i = 1; i <= n; i++) {
			if (i==n) {//마지막 숫자일때 쉼표 생략
				System.out.print(i*i);				
			}else {//마지막 숫자가 아니면 쉼표 추가
				System.out.print(i*i+",");
			}
		}
		System.out.println("]");
	}
}