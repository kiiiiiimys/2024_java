package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//20240223
		//#1
		//삼항연산자를 이용하여 score1이 60 보다 크거나 같으면 합격
		//그렇지 않으면 불합격으로 반환 하시오.
		
		int score1=60;
		String result1;
		result1=(score1>=60?"합격":"불합격");
		System.out.println("합격 여부 : "+result1);
		
		
		//#2
		//삼항연산자를 이용하여 score2가 90보다 크면 'A'이고
		//score2가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다

		int score2=80;
		
		String result2;
		result2= score2>90?"A" : score2>80? "B" : "C";
		System.out.println(result2);

		//선생님, GPT답
		char grade = (score2 > 90)? 'A' : (score2 > 80) ? 'B' : 'C';
		System.out.println("학점 : "+grade);
		
		
		
	}

}
