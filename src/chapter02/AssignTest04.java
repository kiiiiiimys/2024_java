package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		//20240221
		// ��������
		System.out.println("===��������===");
		int gameScore=150;
		
		//int lastScore1=gameScore+1;
		int lastScore1=++gameScore; //2�� ������ �ȵǴµ� �����ϰ� 1�� ������ ������
		//++�� +1�� ������ ++�̶�? ������ �տ� �ϳ��� �߰� ���Ѷ�. ��� ��
		System.out.println(gameScore); // gameScore=>151
		System.out.println(lastScore1); // gameScore=>151
	
		System.out.println("============");
		int lastScore2=--gameScore; // int lastScore1=gameScore-1
		System.out.println(gameScore); // gameScore=>150
		System.out.println(lastScore2); //gameScore=>150
		
		// ��������
				System.out.println("===��������===");
				
		int lastScore3=gameScore++; ; /* �� ���� �� ������ ���� ���Ѱ�.
		�ѱ�� �� �Ŀ� ����� �ϴ� ��. ;�� ���� ���ͼ� ����ϴ� ��*/
		System.out.println(lastScore3); // lastScore3=>150
		System.out.println(gameScore); // gameScore=>151
			
		System.out.println("============");
		int lastScore4=gameScore--;
		System.out.println(lastScore4); //lastScore4=>151
		System.out.println(gameScore); // gameScore=>150
				
		
		

	}

}
