package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//20240227
		
		boolean run = true;
		int balance = 0; //����(+), ���(-)
		 
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");		
			
			int menuNum=Integer.parseInt(scan.nextLine());
			//int menuNum=nextInt(); �� �ص��� �׷��� �ڿ��� nextInt�� ����	
			
			switch (menuNum) {
		case 1: 
			System.out.println("����> ");
			int deposit=Integer.parseInt(scan.nextLine());
			balance+=deposit;
			// balance+=Integer.parseInt(scan.nextLine());
			break;
		case 2:
			System.out.println("��ݾ�> ");
			int withdraw=Integer.parseInt(scan.nextLine());
			balance-=withdraw;
			//balance-=Integer.parseInt(scan.nextLine());
			break;
		case 3:
			System.out.println("�ܰ�> " +balance);
			break;
		case 4: 
			run=false;
			break;
		
			
		
			
		}//switch
		
			System.out.println();
		}//while
		
		System.out.println("���α׷� ����");
		
	}//main

}
