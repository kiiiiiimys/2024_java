package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 20240227
		
		/*
		����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������:������, ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų� 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�� �������?");
		
		String day;

		day=sc.nextLine();
		
		
		
		switch (day) {
		case "������": 
			System.out.println("���");
			break;
		case "ȭ����": 
			System.out.println("������");
			break;
		case "������": 
			System.out.println("�쵿");
			break;
		case "�����": 
			System.out.println("���");
			break;
		case "�ݿ���": 
			System.out.println("ī��");
			break;
		case "�����": 
			System.out.println("�ܹ���");
			break;
		case "�Ͽ���": 
			System.out.println("������ġ");
			break;
			
		}

	}

}
