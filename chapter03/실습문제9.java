package chapter03;

import java.util.Scanner;

public class 실습문제9 {
	public static void main(String[] args) {
		int purchaseAmount;
		int saleAmount;
		double transferTax;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("매수금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		
		System.out.println("매도금액을 입력하세요: ");
		saleAmount = scanner.nextInt();
		
		if (saleAmount>purchaseAmount) {
			transferTax = (saleAmount-purchaseAmount)*0.22;
		}else {
			transferTax = 0;
		}
		System.out.println("양도세= "+transferTax);
	}
}