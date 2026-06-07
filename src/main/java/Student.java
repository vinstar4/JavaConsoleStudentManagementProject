public class Student extends Person implements Comparable<Student> {

	private String studentId;

	public Student(String studentId, String name, int age) {

		super(name, age);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void display() {

		System.out.println("---------------------");
		System.out.println("Student ID : " + studentId);
		System.out.println("Name       : " + name);
		System.out.println("Age        : " + age);
	}

	@Override
	public int compareTo(Student other) {
		return this.name.compareToIgnoreCase(other.name);
	}
}