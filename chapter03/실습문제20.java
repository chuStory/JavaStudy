package chapter03;

import java.util.Scanner;

public class 실습문제20 {
	public static void main(String[] args) {
		int tesla = 520;
		int num;//수량
		int money;//tesla*num
		int res;//계산된 결과값
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		num = scanner.nextInt();
		money=tesla*num;
		
//		money 를 가지고 100달러, 10달러 계산해야 함
		res = money/100;
		
//		100달러짜리가 1매 이상일때
		if (res>0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		
//		10달러짜리 계산
		money=money%100;//나머지 돈을 다시 셋팅
		res = money/10;
		if (res>0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
}