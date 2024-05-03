package chapter01;

public class ImplicitConversion13 {

	public static void main(String[] args) {
		//20240220
		//묵시적 형변환:작은 메모리에서 큰 메모리로 자연스럽게 형변환.(byte->int)
		byte bnum=10;
		int inum=bnum;
		
		System.out.println(bnum);
		System.out.println(inum);
		
		//byte bnum2=inum2; //ERROR
		int inum2=10;
		
		System.out.println(inum2);
		
		//묵시적 형변환:더 정밀한 수로 자연스럽게 암시적 형변환(int->float)
		
		int cnum=10;
		float dnum=cnum;
		
		System.out.println(dnum);
		System.out.println(cnum);
		
		float num1=10.0F;
		//int num2=num1; //ERROR
		
		System.out.println(num1);
		
		
		
		
		
		
		
		
	}

}
