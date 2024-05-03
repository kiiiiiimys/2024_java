package chapter02;

public class Example05 {

	public static void main(String[] args) {
		/* 변수방에 51를 대입(변수방 : number)
		 그 수가 양수인지 여부를 판별하는 프로그램 
		변수방에 저장된 수가 양수면 "양수입니다" 
		그렇지 않을 경우 "음수 또는 0입니다."라고 출력이 되어야함
		 */

		//변수 초기화
		int number;
		number=51;		
		
		//관계연산자를 사용하여 양수 여부 판단
		
		//선생님 답 boolean isPositive=(number>0);
		
		
		//삼항 연산자 사용
		
		/* 선생님 답
		 String result=isPositive? "양수입니다" : "음수 또는 0입니다."
		 */
		
		/*
		int _num = 0;
		String numResult = (0 < _num) ? "양수" : (0 > _num)? "음수" : "0" ; 
		System.out.println(numResult + " 입니다."); 
		*/
		
		String result;
		result=number>0? "양수입니다" : "음수 또는 0입니다." ;
		System.out.println("number>0 : "+result);
		
		
	}

}
