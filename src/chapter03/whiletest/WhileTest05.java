package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		// 20240227
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int score=scan.nextInt();
			
			if(score>100 || score<0){
				System.out.println("잘못 입력 하셨습니다.");
				
			}else if(score>=60) {
				System.out.println("합격 입니다.");
				
			}else if (score<=59){
				System.out.println("불합격 입니다.");
			
	
			/*if(score <0 || scr>100 ) {
				System.out.println("0~100 까지의 점수만 입력 가능 합니다.");
				}else if(score>=60) {
					System.out.println("합격 입니다.");
					
				}else if(score<=59){
					System.out.println("불합격 입니다.");
				}else{
					System.out.println("잘못 입력 하셨습니다.");
			} */
			}
			break;
			
		}//while
		
		System.out.println("프로그램 종료");
	}

}
