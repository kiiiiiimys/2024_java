package chapter03.whiletest;

public class WhileTest03 {

	public static void main(String[] args) {
		// 20240227
		
		int num=1;
		int sum=0;
		
		while(num<=100) {
			sum+=num;
			num++;
			
		}
		System.out.println("1부터 100까지의 합은 : "+sum+ "입니다.");
		
	}

}
