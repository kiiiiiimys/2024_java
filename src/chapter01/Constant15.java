package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		//20240220
		//상수 : 변하지 않는 값 
		//방 이름을 관례적으로 대문자로 쓴다.
		
		final int MAX_NUM=100; //초기화
		final int MIN_NUM; //선언
		final double PI=3.14;
		
		MIN_NUM=0; //리터널값
		// PI=3.14; //리터널값 ERROR
		
		//위의 min은 엑박이 안뜨는데 아래 pi는 왜 엑박이 뜨는가?
		//min은 선언만 했고 pi는 선언만 한것이 아니기 때문에, 엑박이 뜨는 것
		
		//final -> 최대값. 파이널이 붙은 값은 출력할 수 있는 가장 높은 값.
		
		
	}

}
