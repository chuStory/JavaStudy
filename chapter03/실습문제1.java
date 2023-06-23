package chapter03;

public class 실습문제1 {
	public static void main(String[] args) {
		int sum=0, i=0;
		
		while (i<100) {
//			sum=sum+i;
			sum+=i;
//			i=i+2;
			i+=2;
			System.out.println("@@@### i ===>"+i);
			System.out.println("@@@### sum ===>"+sum);
			}
		System.out.println(sum);
		}
	}

