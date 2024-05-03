package chapter01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		//20240220
		//캐스팅 문법(명시적 형변화)
		int iNum=1000;
		byte bNum=(byte)iNum; //음수~양수까지 2의 7제곱 -128~+127
		
		System.out.println(iNum);
		System.out.println(bNum); //유실된 결과값(손실)
		//유실된 결과 값:억지로 넣어주면 결과가 이상하게 나옴
		System.out.println("-------------------");
		
		double dNum1=1.2; //8byte
		float fNum1=0.9f; //4byte int:4byte
		
		int iNum2=(int)(dNum1+fNum1); //1.2+0.9=2.1 => 2
		int iNum3=(int)dNum1+(int)fNum1; //1+0=1
		
		System.out.println(iNum2); //2
		System.out.println(iNum3); //1
		
		//byte가 넘쳤지만 숫자로 보면 int에서 넘치지 않기 때문에, 유실 값이 일어나지 않음.
		
		
	}

}
