package chapter03;

import java.util.Scanner;

public class 실습문제10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int time = scanner.nextInt();
		
//		ex>5000 = 5000/3600=1
		int hour = time / 3600; //시간
		int minute = (time / 60) % 60; //분
		int second = time % 60; //분
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간, ");
		System.out.print(minute+"분, ");
		System.out.print(second+"초입니다.");

		scanner.close();
	}
}
