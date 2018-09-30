
public class Course {
	private String title;
	private int numberOfStudent;
	private Student[] students = new Student[10];
	
	public Course(String title) {
		this.title = title;
	}
	public Course() {}
	
	public void setTitle(String title) {
		this.title = title;
		numberOfStudent = 0;		
	}
	public String getTitle() {
		return title;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public Student[] getStudents() {
		return students;
	}
	public boolean isFull() {
		return (numberOfStudent >= 10);
	}
	public void registerStudent(Student student) {
		if (numberOfStudent == 0) {
			this.students[0] = student;
			numberOfStudent++;		
			System.out.println("Student 1 added");
		}
		else if (!isFull()) {
			students[numberOfStudent] = student;			
			numberOfStudent++;
			System.out.println("Student " + numberOfStudent + " added");
		}
		else {
			System.out.println("The course " + title + " is full.");
		}
	}

}
