package chapter01;

public class DoubleEX06 {

	public static void main(String[] args) {
		////20240220
		// Number : bit�� 8�� -> byte -> short -> int(4byte=32bit) -> long
		// �Ǽ�(�Ҽ����ִ� ����) : float(4byte) -> double(8byte)
		// ���� : char(' ') 
		// ���ڿ� : String(" ")

		
		float fnum=3.14f; // 4byte �ڿ� f�� �ٿ� ��� �ϴµ� ��ҹ��� ��� ����
		double dnum=3.14; // 8byte
		//��� ���忡���� double�� ���� ����. �ֳ� f�Ⱥٿ��� �Ǵϱ�.
		//double�� longó�� ���� ���ڸ� ���� �ڿ��� f�� ������.
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		
	}

}
