package ch02.sec11;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n",value); // %d -> value 값 대입
		System.out.printf("상품의 가격 : %6d원\n",value); // %6d -> 앞자리 3 개 공백 value 대입
		System.out.printf("상품의 가격 : %-6d원\n",value); // %-6d - > 뒷자리 3개 공백 value 대입
		System.out.printf("상품의 가격 : %06d원\n",value); // %06d -> 앞자리 3개 0 value 대입
		
		double area = 3.14159 *10*10; // 314.159
		System.out.printf("반지름이 %d 인 원의넓이:%10.2f\n",10,area); // 정수 7자리 +소수점2 자리 왼쪽 빈자리 공백 올림
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job); // 6 자리 정수 왼쪽 공백 / 10자리 문자열 오른쪽 공백 / 10자리 문자열 왼쪽 공백 
	}

}
