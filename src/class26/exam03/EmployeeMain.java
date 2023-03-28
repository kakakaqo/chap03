/**
 * 실행클래스
 * 객체 생성 방식
 * 1. 빈객체 생성후 값저장
 * 2. 객체 생성하면서 초기값 전달(값저장)
 */

package class26.exam03;

public class EmployeeMain {

	public static void main(String[] args) {

		// 1. 빈객체 생성
		Employee em = new Employee();

		// 1.1 빈객체의 필드에 값저장
		em.empNo = 2005031002;
		em.eName = "배준섭";
		em.position = "과장";
		em.salary = 500;

		// 1.2 객체의 정보 조회(출력)
		//////////// 객체 정보 조회
		System.out.println("empNo : " + em.empNo);
		System.out.println("eName : " + em.eName);
		System.out.println("em.position : " + em.position);
		System.out.println("em.salary : " + em.salary);
		System.out.println();

		// 2021010003, "김홍철, "사원", -250
		// 오버로딩 생성자 활용한 객체 생성
		Employee em1 = new Employee(2021010003, "김홍철", "사원", 500);

		// 2.2 객체의 정보 조회(출력)
		System.out.println("empNo : " + em1.empNo);
		System.out.println("eName : " + em1.eName);
		System.out.println("em.position : " + em1.position);
		System.out.println("em.salary : " + em1.salary);
		
		// 3. 객체 배열
		System.out.println("객체 배열을 통한 사원 정보 조회");
		
		// Employee 배열 3개짜리
		Employee[] emps = new Employee[3];
		
		// 2023010001, "김수희", "대리", 310
		// 2023010001, "박미선", "사원", 280
		// 2023010001, "최무림", "과장", 400
		
		// 오버로딩 생성자 활용
		emps[0] = new Employee( 2023010001, "김수희", "대리", 310 );
		emps[1] = new Employee( 2023010001, "박미선", "사원", 280 );
		emps[2] = new Employee( 2023010001, "최무림", "과장", 400 );
		
		// 3.1 첫번째 사원 정보 출력
		System.out.println(emps[0].empNo + "  " + emps[0].eName 
				+ "  "  + emps[0].position + "  " + emps[0].salary);
		// 3.2 두번째 사원 정보 출력
		System.out.println(emps[1].empNo + "  " + emps[1].eName 
				+ "  "  + emps[1].position + "  " + emps[1].salary);
		// 3.3 세번째 사원 정보 출력
		System.out.println(emps[2].empNo + "  " + emps[2].eName 
				+ "  "  + emps[2].position + "  " + emps[2].salary);
		System.out.println();
		
		// for문을 이용하여 사원 정보 출력
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].empNo + "  " + emps[i].eName 
					+ "  "  +emps[i].position + "  " + emps[i].salary );
		}
		System.out.println();
		
		// 향상된 for문을 이용하요 사원 정보 출력
		for(Employee emps2 : emps) { // String, int 타입이 아닌 Employee객체를 받아서 사용
			System.out.println(emps2.empNo + "  " + emps2.eName 
					+ "  " + emps2.position + "  " + emps2.salary);
		}
		System.out.println();
		
		// 6. 전 사원들의 급여 총액 향상된 for문을 이용
		int sum = 0;
		for (Employee emp3 : emps) {
			sum = sum + emp3.salary;
		}
		System.out.printf("전사원의 급여 총액은 %d입니다." ,sum);
		System.out.println();
		
		// 일반 for문을 이용한것
		int sum1 = 0;
		for (int i = 0; i < emps.length; i++) {
			sum1 = sum1 + emps[i].salary;
		}
		System.out.printf("전사원의 급여 총액은 %d입니다." ,sum1);
	}

}