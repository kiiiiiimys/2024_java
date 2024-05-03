package chapter01;

public class TypeInference12 {

	public static void main(String[] args) {
		//20240220
		//var(참조형 변수선언): 데이터 형태를 보고 알아서 판단하여 타입 지정
		int i=10;    //int
		var n=5; //int
		var j=10.0; //double
		var str="Test Good"; //String
		
		System.out.println(i);
		System.out.println(n);
		System.out.println(j);
		System.out.println(str);

		//특별히 지정하지 않고 이렇게 써도 괜찮음. 문제 없음
	}

}
