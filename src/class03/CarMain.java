/**
 * 실행 클래스
 * - 객체 생성과 필드의 사용(필드에 값 저장)
 * - 필드의 자료형이 가지는 기본 값으로 자동 초기화 된다.(생성한 객체)
 */

package class03;

public class CarMain {
	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car(); // 기본 생성자 호출
       //클래스이름 클래스변수 = 객체생성 클래스이름();
		
		// 필드 초기값 읽기 , 기본값으로 초기화
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("최대속도(int) : " + myCar.maxspeed);
		System.out.println("출발여부(boolean): " + myCar.start);
		System.out.println();

		// myCar 객체의 필드에 값저장
		myCar.model = "제네시스";
		myCar.color = "다크블루";
		myCar.speed = 60;
		myCar.maxspeed = 300;
		myCar.start = true;

		// myCar 객체에 저장한 필드값 조회하기
		System.out.println("모델명(String) : " + myCar.model);
		System.out.println("색상명(String) : " + myCar.color);
		System.out.println("속도(int) : " + myCar.speed);
		System.out.println("최대속도(int) : " + myCar.maxspeed);
		System.out.println("출발여부(boolean): " + myCar.start);
	}
}