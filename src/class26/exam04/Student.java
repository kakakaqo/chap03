package class26.exam04;

public class Student {
	
	public String name;
	public int age;
	public char sex;
	public String number;
	public int score;
	
	public Student () {
		
	}
	
	public Student (String name, int age, char sex, String number, int score) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.number = number;
		this.score = score;
	}
	
	void showStudentInfo() {
		System.out.println(name + " \t " + age + " \t " + sex + 
				" \t " + number + " \t " + score);
	}
}
