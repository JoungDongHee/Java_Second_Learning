package ch02.sec12;
import java.util.Scanner; // Scanner import 하여 사용

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("X 값 입력 : ");
		String strX = scanner.nextLine(); // 스캐너로 입력 받은 값은 문자열 
		int x = Integer.parseInt(strX);
		
		System.out.println("Y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x+y : "+result);
		
		while(true) {
			System.out.println("입력된 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) { // 입력된 문자열이 q 이면 무한 반복 종료
				// byte short int long float double boolean 값이 동일한지 비교할때는 ==
				// String 값을 비교할때는 .equals 를 사용한다 
				break;
			}
			System.out.println("출력된 문자열 : "+ data);
			
		}
		System.out.println("종료");
	}

}
