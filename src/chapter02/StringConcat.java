package chapter02;

public class StringConcat {

	public static void main(String[] args) {
		//20240223
		//Stirng 변수방에서 +는 산술연산자가 아닌 부호연산자로(서로 결합하는 연산자) 사용
		//단, 반드시 문자열이 먼저선언되어야 함.
		String str1="JDK"+14; // JDK 부분을 공백으로 가져가기도 함.
		String str2=str1+" 사용";
		System.out.println(str2);
		//String은 다른것과 조합이 가능하다 글자+숫자도 가능.
		
		//어떤 것이 먼저 연산 되는냐에 따라 다른 결과가 나옴
		String str3="JDK"+11+13;
		String str4=11+13+"JDK"; //연산을 해서 결합해줌.
		
		System.out.println(str3);
		System.out.println(str4);
		
		//암기해랍.
		
		//String은 new는 안써도 됨. 자료형이면서
		//Sanner는 꼭 new를 꼭 써야함.
		
		
				
		
	
		
	
		
		
		}
}
