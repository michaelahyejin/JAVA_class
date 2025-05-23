package Class_practice;



public class Student {

	private String studentName;
	private int studentAge;
	
	
	public Student(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public void studentList() {
		System.out.println("학생 이름: " + this.studentName);
		System.out.println("학생 나이: " + this.studentAge);
	}
	
		
	
	public static void main(String[] args) {
		
		Student a1 = new Student("홍길동", 20);
		
		a1.studentList();
	    
	
	}
	
}
