package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
//		byte 타입 b 변수 선언
//		byte b;
//		변수 선언, 초기화
//		byte : 1byte(8bit)
		byte b=127;
//		int : 4byte
		int i=100;
		
//		변수 2개를 더한 연산
//		연산 결과는 큰타입으로 int
		System.out.println(b+i);
//		정수끼리 연산해서 소수점 이하 버림
		System.out.println(10/4);
//		실수,정수 연산해서 실수로 출력
		System.out.println(10.0/4);
//		실수,실수 연산해서 실수로 출력
		System.out.println(2.9+1.8);
//		정수로 변환되어서 실수와 연산
		System.out.println((int)2.9+1.8);
//		2+1
		System.out.println((int)2.9+(int)1.8);
//		4.7을 정수로 변환
		System.out.println((int)(2.9+1.8));
		
	}
}