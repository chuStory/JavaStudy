package chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
//		20L : 명시적으로 long 타입 선언
//		long var2=20L;
//		대소문자 관계없이 명시됨
		long var2=20l;
//		기본 정수는 int 타입으로 인식됨
		long var3=10000000;
//		명식적으로 long 타입 값을 저장
		long var4=1000000000000L;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
