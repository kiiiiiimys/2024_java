package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// 20240227
		// Scanner Ŭ������ �ν��Ͻ� ���� scan�� ���� �Է¹���
		Scanner sc=new Scanner(System.in);
		
		// ��� �����
		System.out.print("ȸ������ ����� ��� �ǳ���? ");
		
		// A, a -> �ֿ����
		// B, b -> �����
		// ������ -> �Ϲݰ�
		// charAt(0) : String -> char
		
		
		char grade=sc.nextLine().charAt(0);
		switch (grade) {
		case 'A': case 'a':
			System.out.println("������ �ֿ�� �� �Դϴ�.");
			break;
		case 'B': case 'b':
			System.out.println("������ ��� �� �Դϴ�.");
			break;
		default:
			System.out.println("������ �Ϲ� �� �Դϴ�.");
			break;
			
			
			} //switch
		
		}
		
		
		
		
	}


