package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		// 20240227
		
		Scanner scan=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			num=scan.nextInt();
			
			if(num==0) {
				break;
			
			}
			cnt++; //숫자가 몇개 입력 되었는지
			sum+=num; //누적합
		
		}//while
		
		avg=(double)sum/cnt;
		System.out.println("입력된 자료의 갯수 : "+cnt+"\n"); // \t tab \n enter
		System.out.println("입력된 자료의 합계 : "+sum+"\n"); 
		System.out.println("입력된 자료의 평균 : "+Math.round(avg*1000.0)/1000);
		//소수점 세번째 자리에서 반올림 해주는 것.
		
	}

}
