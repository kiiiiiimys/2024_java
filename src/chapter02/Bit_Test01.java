package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		//20240221
		int num1=5; // 0101
		int num2=10; //1010
		
		//Bit OR(|) : �ϳ��� 1�̸� 1�� ����� ��ȯ. / �ϳ��� bit ���� || TF ����
		int result=num1 | num2;
		System.out.println(result);
		
		//Bit AND(&) : ��� 1�̸� 1�� ����� ��ȯ
		result=num1 & num2;
		System.out.println(result);
		
		//Bit XOR(^) : 0�� 1�̸� 1�� ����� ��ȯ
		result=num1 ^ num2;
		System.out.println(result);
		

	}

}
