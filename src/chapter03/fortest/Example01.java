package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 20240226
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
		// ������ ����� ���Ͻÿ�.(��, ����� �Ǽ��� ����� ��)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0, score;
		
		
		System.out.println("�� ���� ������ �˰� �����Ű���?");
		int a =scan.nextInt();
		//�����Է� �ޱ�	
		for(i=1; i<=a; i++) {
			System.out.println(i+"��° ���� �Է� : " );
			score=scan.nextInt();
		
			sum += score;
		    cnt++;
		}

		double avg = (double) sum/cnt;
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
		/*final int MAX_SCORE = 100; // �ִ� ���� ��� ����

		System.out.println("�� ���� ������ �˰� �����Ű���?");
		int a = scan.nextInt(); // �Է� ���� �л� ��

		for (int i = 1; i <= a ; i++) {
    	System.out.print(i+"��° ���� �Է� : ");
    	int score = scan.nextInt();
    
    	// ������ 100���� ����
    	if (score > MAX_SCORE) {
        System.out.println("�Է��� ������ 100�� �ʰ��߽��ϴ�. 100���� �����մϴ�.");
        score = MAX_SCORE;
   		}
    
    	sum += score;
    	cnt++;
		}

		double avg = (double) sum / cnt;
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		 
		 */
		
	}		
				
		
			
	}


