package chapter02;

public class ArithTest02 {

	public static void main(String[] args) {
		// +,-,*,/,%(�ۼ�Ʈ : ���� ���� �������� �̾Ƴ��� ��)
		
		int a1=5;
		int a2=2;
		
		int result5=a1%a2;
		System.out.println("a1 ������ a2�� ������ : "+result5);
		//5�� 2�� ������ 1�� �����ϱ� a1%a2�� 1�� ��.
		
		System.out.println("---------");
		
		float result1=a1/a2;
		float result2=a1*a2;
		float result3=a1+a2;
		float result4=a1-a2;
		
		System.out.println("a1 ������ a2 : "+result1);
		System.out.println("a1 ���ϱ� a2 : "+result2);
		System.out.println("a1 ���ϱ� a2 : "+result3);
		System.out.println("a1 ���� a2 : "+result4);
		
		System.out.println("-----------");
		
		float a3=5f;
		float a4=2f;

		double result6=a3/a4;
		double result7=a3*a4;
		double result8=a3+a4;
		double result9=a3-a4;
		
		System.out.println("a3 ������ a4 : "+result6);
		System.out.println("a3 ���ϱ� a4 : "+result7);
		System.out.println("a3 ���ϱ� a4 : "+result8);
		System.out.println("a3 ���� a4 : "+result9);
		
		System.out.println("---------");
		double result55=(double)a1/a2;
		System.out.println("double�� ����ȯ : "+result55);
		
		
		
	
		
	}

}
