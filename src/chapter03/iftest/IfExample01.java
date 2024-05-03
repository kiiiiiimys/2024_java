package chapter03.iftest;



public class IfExample01 {

		public static void main(String[] args) {
		//20240223
		
			int age=5;
			
			//?를 생략하고 if를 쓴다고 생각하면 됨.
			if (age>=5) { 
				System.out.println("학교에 다닙니다.");
			}else {
				System.out.println("학교에 다니지 않습니다.");
			}
			
			/*String str=(age>=8)? "학교에 다닙니다." : "학교에 다니지 않습니다."
			  와 같은말임*/
		
			
		}
}
