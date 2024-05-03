package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		//20240221
		int num1=5; // 0101
		int num2=10; //1010
		
		//Bit OR(|) : 하나라도 1이면 1로 결과값 반환. / 하나면 bit 연산 || TF 연산
		int result=num1 | num2;
		System.out.println(result);
		
		//Bit AND(&) : 모두 1이면 1로 결과값 반환
		result=num1 & num2;
		System.out.println(result);
		
		//Bit XOR(^) : 0과 1이면 1로 결과값 반환
		result=num1 ^ num2;
		System.out.println(result);
		

	}

}
