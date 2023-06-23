package chapter03;

public class 실습문제25 {
	public static void main(String[] args) {
		int count=0, i=1;
		
		while (i<1001) {//1000까지
			if (i%3 != 0) {//3의 배수가 아니면				
				System.out.print(i+" ");
				count++;//10개 출력을 위한 카운트
			}
			if (count%10 == 0) {//10개 출력할때마다 참
				System.out.println();
			}
			i++;
		}
	}
}