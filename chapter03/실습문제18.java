package chapter03;

import java.util.Scanner;

public class 실습문제18 {
	public static void main(String[] args) {
		boolean cheating;
		int attendrarate, totalscore;
		char grade;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("부정행위 여부(true 혹은 false): ");
		cheating = scanner.nextBoolean();
		
		System.out.println("출석률(0~100사이의 정수값): ");
		attendrarate = scanner.nextInt();
		
		System.out.println("총점(0~100사이의 정수값): ");
		totalscore = scanner.nextInt();
		
		if (cheating) {
			grade = 'F';
		}else if (attendrarate < 80) {
			grade = 'F';
		}else
			if (totalscore>=90) {
				grade = 'A';
			}else if (totalscore>=80) {
				grade = 'B';
			}else if (totalscore>=70) {
				grade = 'C';
			}else if (totalscore>=60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
		System.out.println("학점= "+grade);
	}
}
