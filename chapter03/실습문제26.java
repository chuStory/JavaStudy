
package chapter03;

import java.util.Iterator;

public class 실습문제26 {
	public static void main(String[] args) {
		int count=0;

		for (int i = 200; i < 801; i++) {
			if (i%5 != 0) {
				System.out.print(i+" ");
				count++;
			}
			if (count%10 == 0) {//10개 출력할때마다 참
				System.out.println();
			}			
		}
	}
}