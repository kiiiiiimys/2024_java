package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		// 20240227
		
		Scanner scan=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���");
			num=scan.nextInt();
			
			if(num==0) {
				break;
			
			}
			cnt++; //���ڰ� � �Է� �Ǿ�����
			sum+=num; //������
		
		}//while
		
		avg=(double)sum/cnt;
		System.out.println("�Էµ� �ڷ��� ���� : "+cnt+"\n"); // \t tab \n enter
		System.out.println("�Էµ� �ڷ��� �հ� : "+sum+"\n"); 
		System.out.println("�Էµ� �ڷ��� ��� : "+Math.round(avg*1000.0)/1000);
		//�Ҽ��� ����° �ڸ����� �ݿø� ���ִ� ��.
		
	}

}
