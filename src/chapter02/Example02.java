package chapter02;

public class Example02 {

	public static void main(String[] args) {
		//20240221
		/*soldesk 과수원
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개 5개 입니다.
		 * 과수원에서 하루에 생산되는 총과일의 갯수를 출력하고,
		 * 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오.
		 * (단, 평균값을 남는 데이터 타입은 float)로 정의한다.
		 */

		//#1 
		int pear=5;
		int apple=7;
		int orange=5;
				
		System.out.println("하루에 생산되는 총 과일의 갯수: "+(pear+apple+orange));
		System.out.println("시간당 전체 과일의 평균 생산 갯수:"+(float)(pear+apple+orange)/24);
		
		//#2
		//총갯수
		int fruitTotal =pear+apple+orange;
		System.out.println("하루에 생산되는 총 과일의 갯수:" + fruitTotal);
		//시간당 평균
		float fruitAve= fruitTotal/24f; //f붙이는거 까먹지 말자! 하지만 앞에(float)을 붙여도 소숫점 까지 나온다.
		System.out.println("시간당 생산되는 과일의 평균 :" + fruitAve);
		
		
	}

}
