package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		//20240221
		int num=0B00000101; //5
		System.out.println(num);
		//�������� ������ ���ϱ��� ����, ���������� ������ �������� ����
		//<<���ϱ� ���� / >> ������ ����
		
		System.out.println(num << 2); // 2�� 2���� / 5*4=20
		System.out.println(num >> 2); // 2�� 2���� / 5/4=1
		
		System.out.println("================");
		
		int a,b,c;
		a=5;
		b=2;
		c=a>>b;
		System.out.println(c); // 5/4=1
		
		c=a<<b;
		System.out.println(c); // 5*4=20
		
		
	}

}
