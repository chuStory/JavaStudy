package chapter03;

import java.util.Scanner;

public class 실습문제24 {
	public static void main(String[] args) {
		int sum=0, i=500;
		
		while (i<=600) {
			if (i%5==0) {
				sum+=i;
			}			
			i++;
		}
		System.out.println("5의 배수 합계: "+sum);
	}
}