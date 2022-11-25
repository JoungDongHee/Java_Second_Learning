package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = ""+
	"{\n"+"\t\"id\":\"winter\",\n"+"\t\"name\":\"눈꽃송이\"\n"+"}";
		
		String str2 =  //""" """ 자바 13부터 지원
				"""
					{
						"id":"winter",
						"name":"눈송이"
					}
				""";
	System.out.println(str1);
	System.out.println("---------------------------------");
	System.out.println(str2);
	System.out.println("---------------------------------");
	
		// \ 이어 작성하기 자바 14 부터 지원
		String str = """ 
				나는 자바를\
				학습합니다.
				나는 자바 고수가 될겁니다.
				""";
		System.out.println(str);
	}

}
