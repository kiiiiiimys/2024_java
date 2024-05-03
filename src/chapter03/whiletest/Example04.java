package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		//20240227
		
		boolean run = true;
		int num, num2;
		int save=0;
		int money;
		 
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");		
			
			
			num=scan.nextInt();
			
			if(num==1) {
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 금액 : "+save);
				System.out.print("입금할 금액을 입력하세요 : ");
				money=scan.nextInt();
				save+=money;
				if(money<=0) {
					System.out.println("금액이 잘 못 되었습니다.");
					save-=money;
					System.out.println("현재 금액 : "+save);
					
				}}else if(num==2) {
					System.out.println("출금을 선택하셨습니다.");
					System.out.println("현재 금액 : "+save);
					System.out.println("출금할 금액을 입력하세요 : ");
					money=scan.nextInt();
					save-=money;
					if(save<=0){
						System.out.println("잔액이 부족합니다.");
						System.out.println("현재 금액 : "+save);
						System.out.print("입금할 금액을 입력하세요 : ");
						money=scan.nextInt();
						save+=money;
					}}else if(num==3) {
						System.out.println("잔액확인을 선택하셨습니다");
						System.out.println("현재 금액 : "+save);
					}else if(num==4) {
						System.out.println("종료를 선택하셨습니다");
						run=false;
					}else if(num>4) {
						System.out.println("잘못 선택 하셨습니다.");
			
				}
		
			System.out.println();
		}//while
		
		System.out.println("프로그램 종료");
		
	}//main

}
