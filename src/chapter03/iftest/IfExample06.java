package chapter03.iftest;

public class IfExample06 {
	
	public static void main(String[] args) {
		// 1�� ~ 6������ ���� �� ���� �� ������ �� ���
		int num=(int)(Math.random()*6)+1; // 0 1 2 3 4 5 -> 1 2 3 4 5 6
		
		if(num==1) {
			System.out.println("1�� -> ����");
		}else if(num==2) {
			System.out.println("2�� -> ��¡��Ƣ��");
		}else if(num==3) {
			System.out.println("3�� -> �");
		}else if(num==4) {
			System.out.println("4�� -> �踻��");
		}else if(num==5) {
			System.out.println("5�� -> ���");
		}else if(num==6) {
			System.out.println("6�� -> ������");
		}
		
		}//main

}//class
