package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		//20240226
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���̵� : ");
		String ID = scan.nextLine();
		
		//����ȯ
		
		
		if(ID.equals("admin")) {
			System.out.println("��й�ȣ : ");
			int pass=Integer.parseInt(scan.nextLine());
			if(pass == 240119) {
			
				System.out.println(ID + "�� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			}else {
			System.out.println("������ ID�� �����Ͽ� �ּ���.");
		}


	}

}
