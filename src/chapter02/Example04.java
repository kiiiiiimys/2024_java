package chapter02;

public class Example04 {

	public static void main(String[] args) {
		//���� ���̸� ���ϼ���.(������*������*3.14)
		//������ :10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi / ���� ������ result
				
		//#1		
		int num1=10;
		double pi=3.14;
				
		//int -> double ������ ����ȯ
		
		double result=num1*num1*pi;
		System.out.println("�������� 10�� ���� ���� : "+result);
		
		//#2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//double result2=num2*num2*(num3+"."+num4);
		//String�� �ֻ��� �������̱� ������"." �� ������ ������ ����
		  
		//double result2=num2*num2*(String)(num3+"."+num4); class�� ĳ������ �ȵ�.
		double result2=num2*num2*Double.parseDouble(num3+"."+num4); //class�� class�� �޾ƾ� ��
		System.out.println("���� ���� : "+result2);
		
		//int result2=num2*num2*Integer.parseInt(num3+"."+num4); ����� int�� �ް� ������ Integer�� ����ȯ�� ���ش�
		
		//String=> double : Double.parseDouble
		//Strong=> int : Integer.parseInt
		
		
		
		
	}

}
