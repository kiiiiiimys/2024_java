package chapter02;

public class Example02 {

	public static void main(String[] args) {
		//20240221
		/*soldesk ������
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7�� 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �Ѱ����� ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ���� ������ Ÿ���� float)�� �����Ѵ�.
		 */

		//#1 
		int pear=5;
		int apple=7;
		int orange=5;
				
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����: "+(pear+apple+orange));
		System.out.println("�ð��� ��ü ������ ��� ���� ����:"+(float)(pear+apple+orange)/24);
		
		//#2
		//�Ѱ���
		int fruitTotal =pear+apple+orange;
		System.out.println("�Ϸ翡 ����Ǵ� �� ������ ����:" + fruitTotal);
		//�ð��� ���
		float fruitAve= fruitTotal/24f; //f���̴°� ����� ����! ������ �տ�(float)�� �ٿ��� �Ҽ��� ���� ���´�.
		System.out.println("�ð��� ����Ǵ� ������ ��� :" + fruitAve);
		
		
	}

}
