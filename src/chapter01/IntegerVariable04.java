package chapter01;

public class IntegerVariable04 {
	public static void main(String[] args) {
		//정수 type
		short sVal=10;
		byte bVal=20;
		//세가지가 모두 같아도 된다. 하지만 합을 출력하는 단위는 큰거여야함. (int 3개 가능)
		int result=sVal+bVal;
		
		System.out.println("short : " + sVal);
		System.out.println("byte : " + bVal);
		System.out.println("두 수의 합1 : " + result);
		System.out.println("두 수의 합2 : " + (sVal + bVal));
		
		//result없이 두수의 합을 출력하려면 ()를 사용하여 출력 할 수 있다. 
		//각각의 변수방 출력
		
	}

}
