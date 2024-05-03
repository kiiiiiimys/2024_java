package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		//20240221
		int x=10;
		int y=10;
		int z;
		
		x++; //10 -> 11
		++x; //12
		System.out.println("x = "+x);
		
		System.out.println("============");
		//y후위연산 후 전위연산
		y--; //10 -> 9
		--y; //8
		System.out.println("y = "+y);
		
		System.out.println("============");
		//x후위연산 후 z에 대입
		z= x++; //12
		System.out.println("z = "+z);
		System.out.println("후위연산x = "+x);
		
		System.out.println("============");
		//x전위연산 후 z에 대입
		z=++x; //14
		System.out.println("전위연산x = "+z);
		
		System.out.println("============");
		//x전위연산 + y후위연산 의 결과값은 z에 대입
		System.out.println("y ="+y);
		System.out.println("x = "+x);		
		z=++x+y++;//15+8=23 
		System.out.println("1. z = "+z); 
		//후위 연산이 일어나기 전에 z에 대입 하였기 때문에 15+8 이어서 23
		z=x+y;
		System.out.println("2. z = "+z);
		//후위 연산이 일어난 후에 z에 대입하였기 때문에 15+9 가 되어 24
		
		
	}

}
