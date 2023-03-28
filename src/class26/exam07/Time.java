/**
 * 도메인 클래스, 라이브러리 클래스
 */

package class26.exam07;

public class Time {

	// 필드
	private int hour;
	private int minute;
	private int second;
	
	// 시간값 세팅 메소드(setter 메소드)
	public void setHour(int hour) {
		if( hour < 0 || hour > 23 ) {
			System.out.println("시간 값이 올바르지 않습니다.");
			return;
		}
		this.hour = hour;
	}
	
	// 객체의 내부 정보를 보여주는 메소드
	public void ShowTime() {
		System.out.println("현재 시간은 : " + this.hour + "시입니다."); 
	}
}