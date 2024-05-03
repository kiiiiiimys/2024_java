package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 20240227
		
		int time= (int)(Math.random()*10)+9; //9~18
		System.out.println("[현재시간: " + time +"시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9:
			System.out.println("늦잠자기");
			break;
		case 10: case 11:
			System.out.println("침대에 누워서 휴대폰 하기");
			break;
		case 12: case 13:
			System.out.println("아침겸 점심 식사");
			break;
		case 14: case 15: case 16: case 17: case 18:
			System.out.println("18시 까지 게임");
			break;
		case 19: case 20: case 21: 
			System.out.println("저녁식사");
			break;
		case 22: 
			System.out.println("TV 시청");
			break;
		case 23:
			System.out.println("씻고 월요일 가방 챙기기");
			break;
		case 24:
			System.out.println("취침");
			break;
		default:
			 System.out.println("잠");
			 break;
		}//switch

	}//main

}
