package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 20240226
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
		// 총점과 평균을 구하시오.(단, 평균은 실수로 출력할 것)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0, score;
		
		
		System.out.println("몇 명의 성적을 알고 싶으신가요?");
		int a =scan.nextInt();
		//성적입력 받기	
		for(i=1; i<=a; i++) {
			System.out.println(i+"번째 성적 입력 : " );
			score=scan.nextInt();
		
			sum += score;
		    cnt++;
		}

		double avg = (double) sum/cnt;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		/*final int MAX_SCORE = 100; // 최대 점수 상수 설정

		System.out.println("몇 명의 성적을 알고 싶으신가요?");
		int a = scan.nextInt(); // 입력 받을 학생 수

		for (int i = 1; i <= a ; i++) {
    	System.out.print(i+"번째 성적 입력 : ");
    	int score = scan.nextInt();
    
    	// 만점을 100으로 한정
    	if (score > MAX_SCORE) {
        System.out.println("입력한 성적이 100을 초과했습니다. 100으로 조정합니다.");
        score = MAX_SCORE;
   		}
    
    	sum += score;
    	cnt++;
		}

		double avg = (double) sum / cnt;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		 
		 */
		
	}		
				
		
			
	}


