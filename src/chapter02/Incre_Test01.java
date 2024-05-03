package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		//20240221
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : "+(++a)); //a=a+1 -> a+=1 => 11
		System.out.println("a++ : "+(a++)); //a=a -> a=a+1 -> a+1 =>11
		System.out.println("후위연산 : "+a); //12
		
		System.out.println("-------------");
		//후위 연산은 ;으로 끝난 후에 나중에 계산해서 이후에 출력하면 +1이 되는거임.
		
		System.out.println("c++ : "+(c++)); //3
		System.out.println("후위연산 : "+c); //4
		
		//한바퀴 돌고 난 이후에 값을 증가시켜줘야 하는 경우가 있기 때문에, 꼭 필요한 코드.
		
		System.out.println("-------------");
		//a전위연산+ b후위연산
		//#1
		System.out.println("++a + b++ : "+ (++a+b++)); //현재 13+20=33
		System.out.println("후위연산 : "+b); //21
		//#2
		System.out.println("-------------");
		System.out.println("++a : "+(++a)); //14
		System.out.println("b++ : "+(b++)); //21
		System.out.println("후위연산 : "+b); //22
		System.out.println("++a + b++ : "+(++a + b++)); //15+22=37
		System.out.println("후위연산 : "+b); //23
		
		
		
		
		
		
		
	}

}
