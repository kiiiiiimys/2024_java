package chapter01;

public class Binarytest03 {

	public static void main(String[] args) {
		//20240220
		//0=>���
		//1=>����
		int num1=0B00000000000000000000000000000101; //+5
		int num2=0B11111111111111111111111111111010; //1�Ǻ��� => -6
		int num3=0B11111111111111111111111111111011; //2�Ǻ��� => -5
		//���� : ������ ���� ������ �ִ� ��
		
		
		
		
		
		
		
		System.out.println("num1 : "+num1);
		System.out.println("num1�� 1�� ���� : "+num2);
		System.out.println("num1�� 2�� ���� : "+num3);
		System.out.println("num1 + num3 : "+(num1+num3));
	
	System.out.println("-------------");
	int num4=0B00000000000000000000000000000000;
	int num5=0B01111111111111111111111111111111;
	int num6=0B01111111111111111111111111111110;
	
	
	System.out.println(num4);
	System.out.println(num5);
	System.out.println(num6);
	System.out.println(num4+num6);
	
	System.out.println("--------");
	
	int num7=0B00000000000000000000000000001111;
	int num8=0B11111111111111111111111111110000;
	int num9=0B11111111111111111111111111110001;
	
	System.out.println(num7);
	System.out.println(num8);
	System.out.println(num9);
	System.out.println(num7+num9);
	
	}

}
