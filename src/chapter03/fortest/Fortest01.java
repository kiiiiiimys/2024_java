package chapter03.fortest;

public class Fortest01 {

	public static void main(String[] args) {
		//20240226
		// 1 ���� 10���� ��
		
		int sum=1;
		/*
		System.out.println(++sum); //1 ->���� ����
		System.out.println(sum++); //1 ->���� ����
		System.out.println(sum);//2
		*/
		
		//sum=sum+2; //�ʱ� ���� ������ ���� �� �� ����.
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;
		
		System.out.println(sum); //for �����ڰ� ���ٸ� �̷��� ���������.
		
		System.out.println();
		
		int i;
		System.out.println("1���� 10������ �� ���");
		for(i=1; i<10; i++ ) {
			System.out.print((i+1) + " ");
			
		}
		int j;
		int sum2=0; //������������ �ݵ�� �ʱ�ȭ
		for(j=1; j<=10; j++ ) {
			sum2+=j; //sum2=sum2+j;
		}
		System.out.println();
		System.out.println("1���� 10������ �� : "+sum2); 
		
	
	
	}

}
