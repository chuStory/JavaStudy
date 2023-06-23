package chapter02;

import java.util.Scanner;

public class 평가 {
	public static void main(String[] args) {
		double radius;// 원뿔 밑의 원의 반지름
		double height;// 원뿔의 높이
		double volume;// 원뿔의 부피
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요: ");
		radius = scanner.nextDouble();
		
		System.out.print("원뿔의 높이를 입력하세요: ");
		height = scanner.nextDouble();
		
		volume = 1.0/3.0*Math.PI*radius*radius*height;
		
		System.out.println("원뿔 밑의 원의 반지름: "+radius);
		System.out.println("원뿔의 높이: "+height);
		System.out.println("원뿔의 부피: "+volume);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("원뿔 밑의 원의 반지름을 입력하세요: ");
//		double radius = scanner.nextDouble();
//		System.out.println("원뿔의 높이를 입력하세요: ");
//		double height = scanner.nextDouble();
//		double volume = 1.0/3.0 * Math.PI * radius * radius * height;
//		
//		System.out.println("원뿔 밑의 원의 반지름: "+radius);
//		System.out.println("원뿔의 높이: "+height);
//		System.out.println("원뿔의 부피: "+volume);
//		
//		scanner.close();
	}
}