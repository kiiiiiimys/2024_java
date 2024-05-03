package chapter03.fortest;

public class Fortest08 {

	public static void main(String[] args) {
		//20240226
		//1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요
		
		int num;
		int total=0;
		for (num=0; num<=100; num++ ) {
			
			if(num%2==1) { 
				continue;
				
			}
			System.out.print(num+" ");
			total+=num;
			
		}
			System.out.println();
			System.out.print("1~100까지 3의 배수의 합 : " +total+ "입니다.");
			
	/* int sum=0;
	 * for(int i=1; i<=100; i++){
	 * if(i%3==0){
	 * sum+=i;
	 * }
	 * }
	 * 
		System.out.print("1~100까지 3의 배수의 합 : " +sum+ "입니다.");
	 * 
	 */
		
			
}
	
}

