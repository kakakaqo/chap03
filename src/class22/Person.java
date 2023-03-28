/**
 * final : 변하지 않는 값을 저장
 * - 프로그램 실행 도중에 변경할 수 없다.
 */

package class22;

public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;

	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}