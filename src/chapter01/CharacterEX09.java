package chapter01;

public class CharacterEX09 {
	public static void main(String[] args) {
		//20240220
		//Java에서 Char : 2바이트(16비트) => 유니코드
		//C, C++, C# 에서 Char : 1바이트(8비트) 
		//한글 한자 코드 변환을 해줘야함.
		
		char str1='A';
		char str5='b';
		
		String str2="Hello Java";
		String str3="W";
		String str4="Welcome to Java";
		//char 한글자일때 '' string은 구분 없음
		//다른 코드는 첫번째 글자 소문자, String만 대문자
		//->String은 일반 자료형이 아니다.
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
	
	}

}
