package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		//20240223
		/*���ð��� ������ ������ �Ƶ��� 1000��
		���ð��� ������ �ʵ��л��� 2000��
		���ð��� ������ ��,����л��� 3500��
		���ð��� ������ ������ 5000��*/
		
		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���."));
		
		//if(������ : && �Ǵ� ||)
		//0���� ũ�鼭 8���� �۴ٸ�
		if (age>0 && age<8) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�.");
			//8���� ũ�ų� �����鼭 14���� �۴ٸ�
		} else if(age>=8 && age<14) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�.");
			//14���� ũ�ų� �����鼭 20���� �۴ٸ�
		} else if(age>=14 && age<20) {
			charge=3500;
			System.out.println("��, ����л� �Դϴ�.");
		} else {
			charge=5000;
			System.out.println("���� �Դϴ�.");
		}
		
		System.out.println("������ "+charge+"�� �Դϴ�.");
		
		
		
			 	 	

	}//main
	


}//class