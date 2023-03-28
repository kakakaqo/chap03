/**
 * 정적 멤버(필드, 메소드)
 */

package class18;

public class Calculator {
	// 원주율(멤버변수, 인스턴스 변수)
	static double pi = 3.14159;

	// 넓이 구하는 인스턴스 메소드(원주율 * 반지름 * 반지름)
	static double area(int radius) {
		return pi * radius * radius; // this
	}
}