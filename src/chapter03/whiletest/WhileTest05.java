package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		// 20240227
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int score=scan.nextInt();
			
			if(score>100 || score<0){
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				
			}else if(score>=60) {
				System.out.println("�հ� �Դϴ�.");
				
			}else if (score<=59){
				System.out.println("���հ� �Դϴ�.");
			
	
			/*if(score <0 || scr>100 ) {
				System.out.println("0~100 ������ ������ �Է� ���� �մϴ�.");
				}else if(score>=60) {
					System.out.println("�հ� �Դϴ�.");
					
				}else if(score<=59){
					System.out.println("���հ� �Դϴ�.");
				}else{
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			} */
			}
			break;
			
		}//while
		
		System.out.println("���α׷� ����");
	}

}
