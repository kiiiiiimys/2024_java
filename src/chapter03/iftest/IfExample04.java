package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04{

	public static void main(String[] args) {
		//20240223
		/*���ð��� ������ ������ �Ƶ��� 1000��
		���ð��� ������ �ʵ��л��� 2000��
		���ð��� ������ ��,����л��� 3500��
		���ð��� ������ ������ 5000��*/
		
		int age;
		//int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���."));
		
		/*if(age<=7) {
			System.out.println("1000�� �Դϴ�.");
		}else if(age<=8) {
				System.out.println("2000�� �Դϴ�.");
		}else if(age<=19) {
			System.out.println("3500�� �Դϴ�.");
		}else {
			System.out.println("5000�� �Դϴ�.");
		}
		
		//���1
		if (age<=7) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		} else if(age<=13) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		} else if(age<=19) {
			charge=3500;
			System.out.println("��, ����л� �Դϴ�.");
		} else {
			charge=5000;
			System.out.println("���� �Դϴ�.");
		}
		
		System.out.println("������ "+charge+"�� �Դϴ�.");
		*/
		
		String dev;
		int mon;
		 
		 	if(age>=20){
			 	dev="����"; 
			 	mon=5000; 
			 } else if(age>=14){
				dev="��,����л� �Ƶ�"; 
			 	mon=3500; 
			 }else if(age>=8){
				dev="�ʵ��л�"; 
				mon=2000; 
			 }else{
				dev="������ �Ƶ�"; 
				mon=1000;
			 }
			 System.out.println("����� " +dev+ " �Դϴ�. ������ " +mon+ " �� �Դϴ�.");
			 	 	

	}//main
	


}//class