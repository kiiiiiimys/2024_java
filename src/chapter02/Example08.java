package chapter02;

import java.util.Scanner;

public class Example08 {
	
	public static void main(String[] args) {
	
		// 두 개의 숫자를 입력 받아서 첫 번째 숫자가 두 번째 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("숫자 1 :");
		int num1=scanner.nextInt();
		
		System.out.println("숫자 2 : ");
		int num2=scanner.nextInt();
		
		boolean result2=(num1>=num2);
		System.out.println("num1≥num2 : "+result2);
		
		//boolean result=num1>num2;
		//System.out.println("num1>num2 : "+result);
		
		
		
		
	}

}
