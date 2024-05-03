package chapter02;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책을 학생 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
		int books=534;
		int students=30;
		
		//학생당 한 명이 가지는 책의 수
		System.out.println("학생 한 명이 가지는 책의 수 : "+(books/students)); 

		//남은 책의 수
		System.out.println("남은 책의 수 : "+(books%students));
		
		System.out.println("==========");
		//학생당 한 명이 가지는 책의 수
		int bookPerStudents = (books/students);
		System.out.println("학생 한 명이 가지는 책의 수 : "+(bookPerStudents)); 

		//남은 책의 수
		int bookLeft = (books % students);
		System.out.println("남은 책의 수 : "+(bookLeft));
				
		
	}

}
