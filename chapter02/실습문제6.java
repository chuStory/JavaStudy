package chapter02;import java.util.Scanner;

public class 실습문제6 {
	public static void main(String[] args) {
		final double DOLLAR_RATE = 1200.0;
		final double EURO_RATE = 1500.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		double dollar = won/DOLLAR_RATE;
		double euro = won/EURO_RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		System.out.println(won+"원은 E"+euro+"입니다.");
		scanner.close();

	}
}
