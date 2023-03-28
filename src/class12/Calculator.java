/**
 * 가변길이 parameter 메소드 연습 라이브러리 클래스/vo클래스
 */

package class12;

public class Calculator {
	// 가변길이 매개변수를 갖는 메소드 선언
	int sum(int... values) { // 가변길이 파라미터
		// sum 변수 선언
		int sum = 0;

		// values는 배열 타입의 변수처럼 사용
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		// 합산 결과를 리턴
		return sum;
	}
}