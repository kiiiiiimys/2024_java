package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		//20240221
		// 전위연산
		System.out.println("===전위연산===");
		int gameScore=150;
		
		//int lastScore1=gameScore+1;
		int lastScore1=++gameScore; //2는 생략이 안되는데 유일하게 1은 생략이 가능함
		//++은 +1과 같아짐 ++이란? 무조건 앞에 하나씩 추가 시켜라. 라는 뜻
		System.out.println(gameScore); // gameScore=>151
		System.out.println(lastScore1); // gameScore=>151
	
		System.out.println("============");
		int lastScore2=--gameScore; // int lastScore1=gameScore-1
		System.out.println(gameScore); // gameScore=>150
		System.out.println(lastScore2); //gameScore=>150
		
		// 후위연산
				System.out.println("===후위연산===");
				
		int lastScore3=gameScore++; ; /* 이 끝난 후 대입한 이후 더한것.
		넘기고 난 후에 계산을 하는 것. ;을 빠져 나와서 계산하는 것*/
		System.out.println(lastScore3); // lastScore3=>150
		System.out.println(gameScore); // gameScore=>151
			
		System.out.println("============");
		int lastScore4=gameScore--;
		System.out.println(lastScore4); //lastScore4=>151
		System.out.println(gameScore); // gameScore=>150
				
		
		

	}

}
