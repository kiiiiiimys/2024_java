package chapter02;

import java.util.Scanner;

public class Example08 {
	
	public static void main(String[] args) {
	
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��° ���ڰ� �� ��° ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���� 1 :");
		int num1=scanner.nextInt();
		
		System.out.println("���� 2 : ");
		int num2=scanner.nextInt();
		
		boolean result2=(num1>=num2);
		System.out.println("num1��num2 : "+result2);
		
		//boolean result=num1>num2;
		//System.out.println("num1>num2 : "+result);
		
		
		
		
	}

}
