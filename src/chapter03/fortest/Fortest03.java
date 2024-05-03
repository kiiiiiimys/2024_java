package chapter03.fortest;

import java.util.Scanner;

public class Fortest03 {

	public static void main(String[] args) {
		//20240226
		// 입력받은 수를 초과하면 반복문을 멈추는 조건
		
		int i, sum=0; //누적해서 쓰지 않는 변수를 인덱스변수라고 함.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num=scan.nextInt(); //10
		
		for(i=1; ;i++) {
			//break 조건이 복잡한 경우 생략하고 아래에 입력해줘도 됨.
			if(sum>num) { //넘치면 멈추라고 했기 때문에 1~4까지의 합이 아닌 5까지 더해서 15
				break;
			}
			
			sum+=i;
			
		}
		System.out.println((i-1)+"번째까지의 총합 : "+sum);
		//이미 수행문이 끝났지만 후위연산이기 때문에 5지만 6으로 찍힘 그래서 i-1을 해줘야함.
	}

}
