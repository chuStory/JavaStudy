package chapter03;

public class 실습문제34 {
	public static void main(String[] args) {
		int sum = 0;
		
//		1+(1+2)+(1+2+3)..+(1+2+...+10)
//		1+3+6...+55
//		(2/2)+(6/2)+(12/2)...+55
		for (int i = 1; i <= 10; i++) {
//			(1+1)*1/2=2/2, (1+2)*2/2=6/2, (1+3)*3/2=12/2...
			int tmp = (1+i)*i/2;
			sum += tmp;
		}
		System.out.println(sum);
	}
}