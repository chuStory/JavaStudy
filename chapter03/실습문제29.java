package chapter03;

public class 실습문제29 {
	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {
//			for (int j = 9; j >=1; j--) {
			for (int j = 0; j <i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}