package chapter03.fortest;

import java.util.Scanner;

public class Fortest07 {

	public static void main(String[] args) {
		//20240226
		//10���� ������ �Է¹޾� 3�� ���, 5�� ����� ���� ���
		
		Scanner scan=new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		System.out.println("������ �Է��ϼ��� : ");
		
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
		System.out.println("3�� ��� : "+cnt3);
		System.out.println("5�� ��� : "+cnt5);
			
				
			
		
		
		

	}

}
