package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// 20240227
		
		/*���� ���߱� ����
		1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
		������ ���ڸ� ��Ȯ�� ���� ������ ������ �ݺ�
		���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���*/

		Scanner scan=new Scanner(System.in);
		
		Random random=new Random();
		
		int targetNumber=random.nextInt((100)+1);
		int guess;
		int count=0;
		
		System.out.println("1���� 100���� ���ڸ� ���纸����!");
		
		do {
			//����ڰ� ������ ���� �Է¹޾Ƽ� ī��Ʈ �ޱ�
		System.out.print("1���� 100������ ���ڸ� �Է��� �ּ��� : ");
		guess=scan.nextInt();
		System.out.println();
		
			if(guess>targetNumber) {
			System.out.println("�� ���� ���ڸ� �����ϼ���" );
			
			
			}else if(guess<targetNumber){
			System.out.println("�� ū ���ڸ� �����ϼ���" );
			
			
			}
			count++;
			}while(guess != targetNumber);
		
		System.out.println("�����մϴ�. ! "+count+"�� ���� ���߾����ϴ�");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User �� ������ ���� : "+guess);
	}
	
}

