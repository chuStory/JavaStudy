package chapter02;

import java.util.Scanner;

public class 실습문제11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int median=0;
		
//		a가 b보다 크고, c보다 작다
//		or
//		a가 c보다 크고, b보다 작다
		if ((a>b && a<c) || (a<b && a>c)) {
			median=a;
		}else if((b>a && b<c) || (b<a && b>c)) {
			median=b;
		}else {
			median=c;
		}
		System.out.println("중간값은 "+median);
		scanner.close();
	}

}
