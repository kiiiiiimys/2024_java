package chapter01;

public class BinaryTest01 {

	public static void main(String[] args) {
		
		//자료구조 - Type
		byte aVar=100; //1 byte
		short bVar=30000; //2 byte
		int cVar=50000; //4 byte
		long dVar=100000; //8 byte
		// 그릇의 크기 현재 그릇만 만들어 져있고, 자료는 안들어가 있다. 
		//->현재 초기값이 없다. 초기화를 해라=최초값을 넣어라
		//최초로 들어간 값=초기화
		
		System.out.println("byte 타입 : " + aVar );
		System.out.println("short 타입 : " + bVar );
		System.out.println("int 타입 : " + cVar );
		System.out.println("long 타입 : " + dVar );
	}

}
