package chapter03;

public class 실습문제14 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				System.out.print("짝 ");
				continue;
			}
			System.out.print(i+" ");
//			if (i%3 == 0) {
//				System.out.print("짝 ");
//			} else {
//				System.out.print(i+" ");
//			}
		}
	}
}