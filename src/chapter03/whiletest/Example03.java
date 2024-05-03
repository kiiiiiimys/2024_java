package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//20240227
		
		boolean run = true;
		int balance = 0; //예금(+), 출금(-)
		 
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");		
			
			int menuNum=Integer.parseInt(scan.nextLine());
			//int menuNum=nextInt(); 로 해도됨 그러면 뒤에도 nextInt로 가능	
			
			switch (menuNum) {
		case 1: 
			System.out.println("예금> ");
			int deposit=Integer.parseInt(scan.nextLine());
			balance+=deposit;
			// balance+=Integer.parseInt(scan.nextLine());
			break;
		case 2:
			System.out.println("출금액> ");
			int withdraw=Integer.parseInt(scan.nextLine());
			balance-=withdraw;
			//balance-=Integer.parseInt(scan.nextLine());
			break;
		case 3:
			System.out.println("잔고> " +balance);
			break;
		case 4: 
			run=false;
			break;
		
			
		
			
		}//switch
		
			System.out.println();
		}//while
		
		System.out.println("프로그램 종료");
		
	}//main

}
