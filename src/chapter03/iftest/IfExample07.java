package chapter03.iftest;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		//20240226
		// Scanner ���
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. ù��° �� : ");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println("ù��° �Է� ���� �� ��� : "+num1);
		System.out.println();
		
		System.out.print("2. �ι�° �� : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("�ι�° �Է� ���� �� ��� : "+num2);
		System.out.println();
		
		/*int�� ���� line�� �ڵ����� ����(����)���� ����.
		 scan~->Ŭ���� �ڷ��� double->�׳� �ڷ����̱� ������ ĳ������ �ȵ�.
		 �׷��Ƿ� double�� Ŭ���� �ڷ������� �ٲ㼭 ĳ���� �������.
		 */
		
				

	}

}
