package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// 20240227
		
		int cnt, num;
		boolean run = true;
		String str = ""; //�� ���ڿ��� �ʱ�ȭ
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.println("����>>");
			
			num=Integer.parseInt(scan.nextLine());
			
			switch (num) {
			case 1:
				System.out.println("�� ���� �Է� : ");
				cnt=Integer.parseInt(scan.nextLine()); //5��� �ϸ� 5�� �����ߴٴ� ���� �˰Ե�.
				for(int i=0 ; i<cnt; i++) {
					System.out.println(str+"��"+(i+1)+"��");
					
				}
				System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�.");
				break;
			case 2: System.out.println("�� ���� �Է� : ");
				cnt=Integer.parseInt(scan.nextLine()); //5��� �ϸ� 5�� �����ߴٴ� ���� �˰Ե�.
				System.out.println("���� ���� : ");
				str=scan.nextLine();
				for(int i=0 ; i<cnt; i++) {
				System.out.println(str+"��"+(i+1)+"��");
				//if(str>cnt) {
					//System.out.println();}
				}
				System.out.println("��û�Ͻ�"+cnt+"���� "+str+"���� �ϼ� �Ǿ����ϴ�.");
				break;
			case 3:
				System.out.println("���α׷� ����");
				run=false;
				break;	
			default:
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
				
			}//switch
			
		}//while

	}

}
