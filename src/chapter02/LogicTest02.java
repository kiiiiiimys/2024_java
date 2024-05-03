package chapter02;

public class LogicTest02 {
	
		public static void main(String[] args) {
		
			int num1=10;
			int i=2;
			
			boolean value=(i=i+2)<10 && (num1=num1+2)<10;
			System.out.println(i); //4
			System.out.println(num1); //12
			System.out.println(value); //fales
			
			System.out.println("========");
			
			value=((i=i+2)<10 || (num1=num1+2)<10);
			System.out.println(i); //6
			System.out.println(num1); //14 하지만 12로 나옴 
			System.out.println(value); //ture
			// OR 연산의 경우 앞에가 T면 뒤에꺼는 T 또는 F 둘 중 어떤 답이어도 상관 없으므로 뒤에는 연산하지 않아도 됨. 
			//그러므로 num1이 14가 나와야 하는데 12로 나오는 것.
			
			
	
}
}
