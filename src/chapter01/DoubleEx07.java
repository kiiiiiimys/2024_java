package chapter01;

public class DoubleEx07 {

	public static void main(String[] args) {
	//20240220
		//정수(int)와 실수(float)연산시에는 더 정밀한 수로 자동 형변환 됨.
		int aVal=10; //4byte
		float bVal=10.5f; //4byte
				
		System.out.println("aVal + bVal : "+ (aVal + bVal));
		//더 정밀한 수를 따라가기 떄문에 평균을 낼때는 double를 사용하는게 좋다.
		//float에 정수를 쓰더라도 출력하면 소숫점이 붙어서 나온다.
		
		
	}

}
