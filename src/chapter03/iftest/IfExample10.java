package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		//20240226
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���̵� : ");
		String ID = scan.nextLine();
		
		System.out.println("��й�ȣ : ");
		String PW=scan.nextLine();
		//����ȯ
		
		/*int pass=Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));
				
		if(ID.equals("admin")) {
			System.out.println(ID+" �� ȯ���մϴ�.");
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		}else {
		System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");	
	}
		*/
		int pass = Integer.parseInt(PW);
		
		if(ID.equals("admin")) {
			if(pass == 240119) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			}
			else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("������ ID�� �����Ͽ� �ּ���.");
		}


	}

}
