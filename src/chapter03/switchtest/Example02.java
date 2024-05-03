package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 20240227
		
		/*
		사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요.
		(월요일:떡볶이, 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("뭐 먹을까요?");
		
		String day;

		day=sc.nextLine();
		
		
		
		switch (day) {
		case "월요일": 
			System.out.println("김밥");
			break;
		case "화요일": 
			System.out.println("떡볶이");
			break;
		case "수요일": 
			System.out.println("우동");
			break;
		case "목요일": 
			System.out.println("돈까스");
			break;
		case "금요일": 
			System.out.println("카레");
			break;
		case "토요일": 
			System.out.println("햄버거");
			break;
		case "일요일": 
			System.out.println("샌드위치");
			break;
			
		}

	}

}
