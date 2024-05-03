package chapter01;

public class CharacterEX11 {

	public static void main(String[] args) {
		//20240220
		//유니코드 : A:65 / a:97
		int a=65;
		System.out.println(a);
		System.out.println(a+10);
		
		System.out.println("---------");
		//명시적 형변환 int -> char 
		//작은 숫자일 때 long->int 되는건 묵시적 형변환
		System.out.println((char)a); //아스키코드로 변환 즉 문자로 변환
		//숫자인데 문자인걸로 바꿔준 것 : 아스키코드
		//명시적인 형변환으로 아스키코드로 바꿀 수 있다.
		System.out.println("-----------");
		
		int b=66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("-------------");
		
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		//a2를 97이라고 했기 때문에, 아스키코드로 바꿔 주었을 때, a로 출력됨.
		
		int c=93;
		System.out.println(c);
		System.out.println((char)c);
		
		
		
		
		
	}

}
