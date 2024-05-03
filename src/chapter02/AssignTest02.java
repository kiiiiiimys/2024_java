package chapter02;

public class AssignTest02 {

	public static void main(String[] args) {
		// 20240221
		
		int num1=20;
		System.out.println("nun1=num1+10 : "+(num1+=10));
		System.out.println("nun1=num1-10 : "+(num1-=10));
		System.out.println("nun1=num1*10 : "+(num1*=10));
		System.out.println("nun1=num1/10 : "+(num1/=10));
		System.out.println("nun1=num1%10 : "+(num1%=10));
	
		//누적된 값임. System.out.println("nun1=num1/10 : "+(num1/=10)); 에서 =이 빠졌으면 누적값이 아닌 그냥 1개의 값.
		
	}

}
