package chapter03.fortest;

public class Fortest05 {

	public static void main(String[] args) {
		// 20240226
		
		int i; //인덱스 변수 : 순서를 지정해주는 변수
		char alpa='A'; // 아스키 코드 값 : 65
		
		for(i=alpa;i<='Z';i++) {
			System.out.println((char)i); 
			/*숫자>글자로 바꿔줄 때, 캐스팅을 해줘야 하지만(?) 
			 아스키 코드는 약속이 되어있기 때문에 그냥 캐스팅해주면 됨.
			 */
		}
		
		
		
		
		
		
	}

}
