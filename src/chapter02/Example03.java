package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//20240223
		//#1
		//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		
		int score1=60;
		String result1;
		result1=(score1>=60?"�հ�":"���հ�");
		System.out.println("�հ� ���� : "+result1);
		
		
		//#2
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�

		int score2=80;
		
		String result2;
		result2= score2>90?"A" : score2>80? "B" : "C";
		System.out.println(result2);

		//������, GPT��
		char grade = (score2 > 90)? 'A' : (score2 > 80) ? 'B' : 'C';
		System.out.println("���� : "+grade);
		
		
		
	}

}
