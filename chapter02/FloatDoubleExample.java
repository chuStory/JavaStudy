package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
//		float var1=3.14;//오류 발생
//		float var1=(float) 3.14;
		float var1=3.14f;
		double var2=3.14;
		float var3=0.12345678901234567890123456789012345678901234567890123456789012345678901234567890f;
		double var4=0.12345678901234567890123456789012345678901234567890123456789012345678901234567890;
		
		double var5=3e6;
		double var6=2e-3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		}
}
