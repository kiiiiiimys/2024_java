package chapter01;

public class LongVariable05 {

	public static void main(String[] args) {
		////20240220
		// Long Type
		//int nun1=12345678900; // int�� -> 32��Ʈ(X)
		long num2=12345678900L; // long ->64��Ʈ long�� �ڿ� L�� �ٿ���� ��.
		long num3=1000; //long���� 64��Ʈ���� L�� ����Ǿ� ���� �������� int�� �ν��Ͽ� �ڵ� ����ȯ��.
		//int�� ǥ�� �� �� ���� ���ڴ� L�� �ٿ��� �ϰ� �ƴϸ� int�� �ڵ���ȯ.
		
		
		System.out.println(num2);
		System.out.println(num3);
	
		int level; //���� �ϰ� �ʱ�ȭ ���� ����.
		level=10; //ó���� ������ �ϰ� 10�� ���߿� ���ԵȰ���. : ���ͳ� ��.(�ʱⰪ�̶� �ص� �Ǳ� ��. ��� ó�� ���Ŵϱ�)
		
		System.out.println(level); //�ڵ�� ������� ��Ŭ���� ������ ����� ���ϸ�, 
		System.out.println(num2+num3); //long������ ������ �ؼ� �ڿ� L�� ������ �ʾƵ� �ڵ���ȯ 
		
		
	}

}
