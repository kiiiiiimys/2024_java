package chapter03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		//20240226
		// Scanner 사용
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. 첫번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println("첫번째 입력 받은 수 출력 : "+num1);
		System.out.println();
		
		System.out.print("2. 두번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("두번째 입력 받은 수 출력 : "+num2);
		System.out.println();
		
		/*int는 정수 line은 자동으로 개행(엔터)까지 포함.
		 scan~->클래스 자료형 double->그냥 자료형이기 때문에 캐스팅이 안됨.
		 그러므로 double도 클래스 자료형으로 바꿔서 캐스팅 해줘야함.
		 */
		
				

	}

}
