package chapter03.fortest;

public class Fortest08 {

	public static void main(String[] args) {
		//20240226
		//1�������� 100������ �� �߿��� 3�� ����� ã�� ���� ����ϼ���
		
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
			System.out.print("1~100���� 3�� ����� �� : " +total+ "�Դϴ�.");
			
	/* int sum=0;
	 * for(int i=1; i<=100; i++){
	 * if(i%3==0){
	 * sum+=i;
	 * }
	 * }
	 * 
		System.out.print("1~100���� 3�� ����� �� : " +sum+ "�Դϴ�.");
	 * 
	 */
		
			
}
	
}

