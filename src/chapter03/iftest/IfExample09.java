package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		// �����ͼ�
		String ID="soldesk";
		int PW=240119;
		
		//��
		String id=JOptionPane.showInputDialog("���̵�");
		int pass=Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));
		
		if(ID.equals(id)) {
			//equals�� �ΰ��� ��Ʈ���̾�߸� �� ����
			//��й�ȣ
			if(PW==pass) {
				System.out.println(ID+" �� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");	
		}
		
		
		

	}//main

}//calss
