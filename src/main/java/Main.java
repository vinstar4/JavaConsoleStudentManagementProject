
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Student> students = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== Student Management System =====");
			System.out.println("1. Add Student");
			System.out.println("2. Find Student");
			System.out.println("3. Display All Students");
			System.out.println("4. Sort Students By Name");
			System.out.println("5. Update Student");
			System.out.println("6. Delete Student");
			System.out.println("7. Count Students");
			System.out.println("8. Exit");

			int choice;

			try {

				System.out.print("Enter Choice: ");
				choice = scanner.nextInt();

			} catch (Exception e) {

				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
				continue;
			}

			switch (choice) {

			case 1:

				System.out.print("Enter Student ID: ");
				String id = scanner.next();

				if (students.containsKey(id)) {
					System.out.println("Student ID already exists.");
					break;
				}

				System.out.print("Enter Name: ");
				String name = scanner.next();

				int age;

				try {

					System.out.print("Enter Age: ");
					age = scanner.nextInt();

				} catch (Exception e) {

					System.out.println("Age must be a number.");
					scanner.nextLine();
					break;
				}

				if (age < 18 || age > 35) {
					System.out.println("Age must be between 18 and 35.");
					break;
				}

				Student student = new Student(id, name, age);

				students.put(id, student);

				System.out.println("Student Added Successfully.");

				break;

			case 2:

				System.out.print("Enter Student ID: ");
				String searchId = scanner.next();

				Student foundStudent = students.get(searchId);

				if (foundStudent == null) {
					System.out.println("Student Not Found.");
				} else {
					foundStudent.display();
				}

				break;

			case 3:

				if (students.isEmpty()) {

					System.out.println("No Students Available.");

				} else {

					for (Student s : students.values()) {
						s.display();
					}
				}

				break;

			case 4:

				if (students.isEmpty()) {

					System.out.println("No Students Available.");

				} else {

					ArrayList<Student> sortedStudents = new ArrayList<>(students.values());

					Collections.sort(sortedStudents);

					System.out.println("Students Sorted By Name:");

					for (Student s : sortedStudents) {
						s.display();
					}
				}

				break;

			case 5:

				System.out.print("Enter Student ID: ");
				String updateId = scanner.next();

				Student updateStudent = students.get(updateId);

				if (updateStudent == null) {

					System.out.println("Student Not Found.");

				} else {

					System.out.print("Enter New Name: ");
					String newName = scanner.next();

					int newAge;

					try {

						System.out.print("Enter New Age: ");
						newAge = scanner.nextInt();

					} catch (Exception e) {

						System.out.println("Age must be a number.");
						scanner.nextLine();
						break;
					}

					if (newAge < 18 || newAge > 35) {
						System.out.println("Age must be between 18 and 35.");
						break;
					}

					updateStudent.setName(newName);
					updateStudent.setAge(newAge);

					System.out.println("Student Updated Successfully.");
				}

				break;

			case 6:

				System.out.print("Enter Student ID: ");
				String deleteId = scanner.next();

				Student removedStudent = students.remove(deleteId);

				if (removedStudent == null) {
					System.out.println("Student Not Found.");
				} else {
					System.out.println("Student Deleted Successfully.");
				}

				break;

			case 7:

				System.out.println("Total Students: " + students.size());

				break;

			case 8:

				System.out.println("Good Bye!");
				scanner.close();
				System.exit(0);

			default:

				System.out.println("Invalid Choice.");
			}
		}
	}
}