package chapter03;

import java.util.Scanner;

public class 실습문제30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int number = scanner.nextInt();
		
		if (number >= 0 && number <= 9) {
			System.out.println(number+"은(는) 한 자리 숫자이다.");
		}else if (number >= 10 && number <= 99) {
			System.out.println(number+"은(는) 두 자리 숫자이다.");
		}else if (number >= 100 && number <= 990) {
			System.out.println(number+"은(는) 세 자리 숫자이다.");
		}else {
			System.out.println("오류! "+number+"은(는) 범위(0~999) 이외의 숫자이다.");
		}
	}
}