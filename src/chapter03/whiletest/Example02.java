package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 20240227
		
		/* ���丮�� �˰���
		 5! �� 5x4x3x2x1 => n! nx(n-1)x(n-2)x(n-3)x(n-4)
		 */
		
		int number=5;
		int factorial=1; // factorial*=number
		//���ڰ� 0�� �ƴ� ������ �ݺ��ϴ� ���丮�� ���
		while(number>0) {
			factorial*=number;
			number--;
				
			}
			
		System.out.println("���丮�� ��� : " +factorial);
		
	}

}
