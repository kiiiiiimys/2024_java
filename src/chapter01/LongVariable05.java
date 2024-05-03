package chapter01;

public class LongVariable05 {

	public static void main(String[] args) {
		////20240220
		// Long Type
		//int nun1=12345678900; // int는 -> 32비트(X)
		long num2=12345678900L; // long ->64비트 long은 뒤에 L을 붙여줘야 함.
		long num3=1000; //long형의 64비트지만 L이 선언되어 있지 않으르모 int로 인식하여 자동 형변환됨.
		//int가 표현 할 수 없는 숫자는 L을 붙여야 하고 아니면 int로 자동변환.
		
		
		System.out.println(num2);
		System.out.println(num3);
	
		int level; //선언만 하고 초기화 하지 않음.
		level=10; //처음에 선언을 하고 10이 나중에 대입된것임. : 리터널 값.(초기값이라도 해도 되긴 함. 어쩃든 처음 쓴거니까)
		
		System.out.println(level); //코드와 상관없이 이클립스 사용법임 출력을 안하면, 
		System.out.println(num2+num3); //long형으로 선언을 해서 뒤에 L을 붙이지 않아도 자동변환 
		
		
	}

}
