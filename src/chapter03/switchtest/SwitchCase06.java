package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 20240227
		
		int time= (int)(Math.random()*10)+9; //9~18
		System.out.println("[����ð�: " + time +"��]");
		System.out.print("�� �� : ");
		
		switch (time) {
		case 9:
			System.out.println("�����ڱ�");
			break;
		case 10: case 11:
			System.out.println("ħ�뿡 ������ �޴��� �ϱ�");
			break;
		case 12: case 13:
			System.out.println("��ħ�� ���� �Ļ�");
			break;
		case 14: case 15: case 16: case 17: case 18:
			System.out.println("18�� ���� ����");
			break;
		case 19: case 20: case 21: 
			System.out.println("����Ļ�");
			break;
		case 22: 
			System.out.println("TV ��û");
			break;
		case 23:
			System.out.println("�İ� ������ ���� ì���");
			break;
		case 24:
			System.out.println("��ħ");
			break;
		default:
			 System.out.println("��");
			 break;
		}//switch

	}//main

}
