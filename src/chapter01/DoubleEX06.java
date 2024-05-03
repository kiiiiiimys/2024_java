package chapter01;

public class DoubleEX06 {

	public static void main(String[] args) {
		////20240220
		// Number : bit가 8개 -> byte -> short -> int(4byte=32bit) -> long
		// 실수(소수점있는 숫자) : float(4byte) -> double(8byte)
		// 문자 : char(' ') 
		// 문자열 : String(" ")

		
		float fnum=3.14f; // 4byte 뒤에 f를 붙여 줘야 하는데 대소문자 상관 없음
		double dnum=3.14; // 8byte
		//사람 입장에서는 double을 많이 쓴다. 왜냐 f안붙여도 되니까.
		//double도 long처럼 작은 숫자를 쓰면 자연히 f로 내려감.
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		
	}

}
