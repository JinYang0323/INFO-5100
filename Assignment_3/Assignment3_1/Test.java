
public class Test {
	
	public static void main(String args[]) {
		Student student1 = new Student("Alice", "01");
		Student student2 = new Student("Bob", "02");
		Course course1 = new Course("Java");
		course1.registerStudent(student1);
		course1.registerStudent(student2);
		Student[] students = course1.getStudents();		
	}
}
