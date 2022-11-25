package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //문자열 을 int 로 변환
		double value2 = Double.parseDouble("3.14"); // 문자열 을 Double 로 변환
		boolean value3 = Boolean.parseBoolean("true"); // 문자열을 Boolean 으로 변환
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		String str1 = String.valueOf(10); // 숫자형을 문자로 변환
		String str2 = String.valueOf(3.14); // 숫자형을 문자로 변환
		String str3 = String.valueOf(true); // boolean 을 문자로 변환
		
		System.out.println("str1 : "+str1);
		System.out.println("str1 : "+str2);
		System.out.println("str1 : "+str3);
		
		System.out.println();
	}

}
