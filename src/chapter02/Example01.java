package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å�� �л� 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���
		
		int books=534;
		int students=30;
		
		//�л��� �� ���� ������ å�� ��
		System.out.println("�л� �� ���� ������ å�� �� : "+(books/students)); 

		//���� å�� ��
		System.out.println("���� å�� �� : "+(books%students));
		
		System.out.println("==========");
		//�л��� �� ���� ������ å�� ��
		int bookPerStudents = (books/students);
		System.out.println("�л� �� ���� ������ å�� �� : "+(bookPerStudents)); 

		//���� å�� ��
		int bookLeft = (books % students);
		System.out.println("���� å�� �� : "+(bookLeft));
				
		
	}

}
