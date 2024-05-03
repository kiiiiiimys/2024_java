package chapter03.fortest;

import java.util.Scanner;

public class Fortest07 {

	public static void main(String[] args) {
		//20240226
		//10개의 정수를 입력받아 3의 배수, 5의 배수를 각각 출력
		
		Scanner scan=new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		System.out.println("정수를 입력하세요 : ");
		
		for(int i=1; i<=10 ; i++) {
			a=scan.nextInt();
			
		if(a%3==0) {
			cnt3++;
		}
		System.out.println();
		if(a%5 == 0) {
			cnt5++;
			
		}
		
		}
		System.out.println("3의 배수 : "+cnt3);
		System.out.println("5의 배수 : "+cnt5);
			
				
			
		
		
		

	}

}
