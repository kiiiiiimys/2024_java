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
		//y�������� �� ��������
		y--; //10 -> 9
		--y; //8
		System.out.println("y = "+y);
		
		System.out.println("============");
		//x�������� �� z�� ����
		z= x++; //12
		System.out.println("z = "+z);
		System.out.println("��������x = "+x);
		
		System.out.println("============");
		//x�������� �� z�� ����
		z=++x; //14
		System.out.println("��������x = "+z);
		
		System.out.println("============");
		//x�������� + y�������� �� ������� z�� ����
		System.out.println("y ="+y);
		System.out.println("x = "+x);		
		z=++x+y++;//15+8=23 
		System.out.println("1. z = "+z); 
		//���� ������ �Ͼ�� ���� z�� ���� �Ͽ��� ������ 15+8 �̾ 23
		z=x+y;
		System.out.println("2. z = "+z);
		//���� ������ �Ͼ �Ŀ� z�� �����Ͽ��� ������ 15+9 �� �Ǿ� 24
		
		
	}

}
