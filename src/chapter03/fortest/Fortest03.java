package chapter03.fortest;

import java.util.Scanner;

public class Fortest03 {

	public static void main(String[] args) {
		//20240226
		// �Է¹��� ���� �ʰ��ϸ� �ݺ����� ���ߴ� ����
		
		int i, sum=0; //�����ؼ� ���� �ʴ� ������ �ε���������� ��.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int num=scan.nextInt(); //10
		
		for(i=1; ;i++) {
			//break ������ ������ ��� �����ϰ� �Ʒ��� �Է����൵ ��.
			if(sum>num) { //��ġ�� ���߶�� �߱� ������ 1~4������ ���� �ƴ� 5���� ���ؼ� 15
				break;
			}
			
			sum+=i;
			
		}
		System.out.println((i-1)+"��°������ ���� : "+sum);
		//�̹� ���๮�� �������� ���������̱� ������ 5���� 6���� ���� �׷��� i-1�� �������.
	}

}
