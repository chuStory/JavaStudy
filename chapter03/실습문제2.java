package chapter03;

public class 실습문제2 {
	public static void main(String[] args) {
		int sum=0, i;
//		0~99 까지 짝수만
		for (i = 0; i < 100; i+=2) {
			sum+=i;			
//			System.out.println("@@@### i ===>"+i);
//			System.out.println("@@@### sum ===>"+sum);
		}
		System.out.println(sum);
	}
}
