package chapter01;

public class CharacterEX11 {

	public static void main(String[] args) {
		//20240220
		//�����ڵ� : A:65 / a:97
		int a=65;
		System.out.println(a);
		System.out.println(a+10);
		
		System.out.println("---------");
		//����� ����ȯ int -> char 
		//���� ������ �� long->int �Ǵ°� ������ ����ȯ
		System.out.println((char)a); //�ƽ�Ű�ڵ�� ��ȯ �� ���ڷ� ��ȯ
		//�����ε� �����ΰɷ� �ٲ��� �� : �ƽ�Ű�ڵ�
		//������� ����ȯ���� �ƽ�Ű�ڵ�� �ٲ� �� �ִ�.
		System.out.println("-----------");
		
		int b=66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("-------------");
		
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		//a2�� 97�̶�� �߱� ������, �ƽ�Ű�ڵ�� �ٲ� �־��� ��, a�� ��µ�.
		
		int c=93;
		System.out.println(c);
		System.out.println((char)c);
		
		
		
		
		
	}

}
