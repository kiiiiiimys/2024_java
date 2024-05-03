package chapter02;

public class ArithTest02 {

	public static void main(String[] args) {
		// +,-,*,/,%(퍼센트 : 나눈 다음 나머지를 뽑아내는 것)
		
		int a1=5;
		int a2=2;
		
		int result5=a1%a2;
		System.out.println("a1 나누기 a2의 나머지 : "+result5);
		//5를 2로 나누면 1이 남으니까 a1%a2는 1이 됨.
		
		System.out.println("---------");
		
		float result1=a1/a2;
		float result2=a1*a2;
		float result3=a1+a2;
		float result4=a1-a2;
		
		System.out.println("a1 나누기 a2 : "+result1);
		System.out.println("a1 곱하기 a2 : "+result2);
		System.out.println("a1 더하기 a2 : "+result3);
		System.out.println("a1 빼기 a2 : "+result4);
		
		System.out.println("-----------");
		
		float a3=5f;
		float a4=2f;

		double result6=a3/a4;
		double result7=a3*a4;
		double result8=a3+a4;
		double result9=a3-a4;
		
		System.out.println("a3 나누기 a4 : "+result6);
		System.out.println("a3 곱하기 a4 : "+result7);
		System.out.println("a3 더하기 a4 : "+result8);
		System.out.println("a3 빼기 a4 : "+result9);
		
		System.out.println("---------");
		double result55=(double)a1/a2;
		System.out.println("double로 형변환 : "+result55);
		
		
		
	
		
	}

}
