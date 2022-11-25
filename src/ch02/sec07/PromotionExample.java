package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		/*
		 * byte < short,char < int < long < flot< double
		 * */
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue :" + intValue);
		
		char charValue = '가'; // '' 작은 따옴표는 char 타입
		intValue = charValue;
		System.out.println("가의 유니코드"+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("long:"+longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("float : "+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("double : "+ doubleValue);
	}

}
