/**
 * 실행 클래스
 * 오버로딩 생성자 호출과 다양한 범위의 필드 초기화
 */

package class06;

public class CarMain {
	public static void main(String[] args) {
		
		// 기본 생성자로 객체 생성
		Car myCar1 = new Car();
		
		/**
		 * 오버로딩 생성자 호출
		 * - 객체를 생성하면서 초기화 값을 전달
		 * - 오버로딩 생성자에 전달한 인자값으로 객체가 만들어짐. 
		 */
		
		// 오버로딩 생성자 #1을 통한 객체 생성
		Car myCar2 = new Car("제네시스");
		
		// 오버로딩 생성자 #2을 통항 객체 생성
		Car myCar3 = new Car("제네시스" , "다크블루");
		
		// 오버로딩 생성자 #3을 통한 객체 생성
		Car myCar4 = new Car("제네시스", "다크블루", 70);
		
		// 오버로딩 생성자 #4을 통한 객체 생성
		Car myCar5 = new Car("제네시스", "다크블루", 70, true);
		
		// 기본 생성자로 만들어진 객체의 값 출력
		System.out.println("myCar1 모델명(String) : " + myCar1.model);
		
		// 오버로딩 생성자에 전달한 값으로 초기화된 객체
		System.out.println("myCar2 모델명(String) : " + myCar2.model);
		System.out.println("색상(String) : " + myCar3.color);
		System.out.println("속도(int) : " + myCar4.speed);
		System.out.println("출발여부(boolean) : " + myCar5.start);
	}
}

/**
 * 생성자 : 필드를 초기화   
 * 생성자 오버로딩 : 멤버 변수를 다양한 범위로 초기화 하기 위해서
 * 1 타입 (자료형)
 * 2 갯수
 * 3 순서
 * 객체 -> 아무값이 없으면 null  배열 -> 아무값이 없으면null  String -> 아무값이 없으면null
 */