package chapter03;

public class 실습문제28 {
	public static void main(String[] args) {
		int n=1, sum=0, count=0;
		
		while (n<=100) {
			if (n%2 == 1) {//홀수일때
				sum += n;//값을 sum에 누적
				System.out.print(sum+"\t");
				count++;
			}
			if (count%10 == 0) {//10개 출력할때마다 참
				System.out.println();
			}
			n++;
		}
	}
}