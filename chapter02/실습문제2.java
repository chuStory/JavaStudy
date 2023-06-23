package chapter02;

import java.util.*;

public class 실습문제2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로, 세로 길이를 입력하세요>>");
//		첫번째 정수를 가로 변수로 입력 받음
		int width = scanner.nextInt();
//		두번째 정수를 세로 변수로 입력 받음
		int height = scanner.nextInt();
		int rectangleArea = width * height;
		System.out.println("사각형의 면적은 "+rectangleArea+"입니다.");
		scanner.close();
	}

}
