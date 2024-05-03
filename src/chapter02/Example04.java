package chapter02;

public class Example04 {

	public static void main(String[] args) {
		//원의 넓이를 구하세요.(반지름*반지름*3.14)
		//반지름 :10, 3.14는 double로 정의하여 구하시오
		//반지름 변수방 num1 / 3.14 변수방 pi / 넓이 변수방 result
				
		//#1		
		int num1=10;
		double pi=3.14;
				
		//int -> double 묵시적 형변환
		
		double result=num1*num1*pi;
		System.out.println("반지름이 10인 원의 넓이 : "+result);
		
		//#2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//double result2=num2*num2*(num3+"."+num4);
		//String이 최상위 변수방이기 떄문에"." 이 붙으면 에러가 난다
		  
		//double result2=num2*num2*(String)(num3+"."+num4); class는 캐스팅이 안됨.
		double result2=num2*num2*Double.parseDouble(num3+"."+num4); //class는 class로 받아야 함
		System.out.println("원의 넓이 : "+result2);
		
		//int result2=num2*num2*Integer.parseInt(num3+"."+num4); 결과를 int로 받고 싶으면 Integer로 형변환을 써준다
		
		//String=> double : Double.parseDouble
		//Strong=> int : Integer.parseInt
		
		
		
		
	}

}
