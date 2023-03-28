package class26.exam04;

public class StudentMain {
	public static void main(String[] args) {
		Student[] arrStd = new Student[5];

		arrStd[0] = new Student("김종현", 23, '남', "010-2340-1233", 85);
		arrStd[1] = new Student("정순미", 24, '여', "010-9857-7532", 70);
		arrStd[2] = new Student("이민성", 22, '남', "010-6548-4687", 96);
		arrStd[3] = new Student("최주호", 20, '남', "010-2528-9368", 85);
		arrStd[4] = new Student("고미림", 26, '여', "010-1068-2549", 77);

		double avg = 0.0;
		int maxScore = 0;
		int sum = 0;
		String maxName = " ";

		System.out.println("====================================================");
		System.out.println("name     age   gender         phone             score");
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < arrStd.length; i++) {
			System.out.println(arrStd[i].name + " \t " + arrStd[i].age + " \t " + arrStd[i].sex + " \t  "
					+ arrStd[i].number + " \t " + arrStd[i].score);
			sum += arrStd[i].score;
			if (maxScore < arrStd[i].score) {
				maxScore = arrStd[i].score;
				maxName = arrStd[i].name;
			}

		}
		avg = (double) sum / arrStd.length;

		System.out.println("----------------------------------------------------");
		System.out.println("총인원 : " + arrStd.length);
		System.out.printf("평균  : %.2f", avg);
		System.out.println();
		System.out.printf("최고점수는 : %d점이며 최고성적은 :%s님 입니다.", maxScore, maxName);
		System.out.println();

		int sum1 = 0;
		double avg1 = 0.0;
		int maxScore1 = 0;
		String maxName1 = " ";
		for (Student student : arrStd) {
			student.showStudentInfo();
			sum1 += student.score;
			if (maxScore1 < student.score) {
				maxScore1 = student.score;
				maxName1 = student.name;
			}
		}
		avg1 = (double) sum / arrStd.length;
		System.out.println("총 인원 : " + arrStd.length );
		System.out.printf("평균 : %.2f" , avg1);
		System.out.println();
		System.out.printf("최고점수는 : %d점이며 최고성적은 :%s님 입니다.", maxScore1, maxName1);
	}
}
