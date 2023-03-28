/**
 * [메소드 오버로딩]
 * 계산기 라이브러리 클래스
 * 동일한 이름의 메소드를 매개변스의 타입, 갯수, 순서를 달리하여 정의함
 * 매개변수의 형태에 따라서 알맞은 메소드가 자동으로 호출된다. 
 */

package class26.exam05;

public class Calcu02 {

	// 오버로딩 메소드( int + int)
	public int add(int x, int y) {
		return x + y;
	}

	// 오버로딩 메소드( int + long)
	public long add(int x, long y) {
		return x + y;
	}

	// 오버로딩 메소드( long + int )
	public long add(long x, int y) {
		return x + y;
	}

	// 오버로딩 메소드( long + long )
	public long add(long x, long y) {
		return x + y;
	}

	// 오버로딩 메소드 (int형 배열 합산)
	int add(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}