package chapter03.fortest;

public class Fortest02 {

	public static void main(String[] args) {
		//20240226
		System.out.println("===1부터 100까지의 합을 출력===");
		
		int i;
		int sum=0;
		for (i=1; i<=100; i++ ) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.print("1부터 100까지의 합 : "+sum+"입니다.");

	}

}
