package Class_practice;

public class InstanceVariable {

	
	int age = 0;//인스턴스 변수
	static int totalStudents = 0; //static을 쓰면 객체생성없이 바로 사용가능
	
	//생성자 생성
	public InstanceVariable(int age) {
		this.age = age;
		totalStudents += 1;
		
	}
	
	
	//클래수 메소드 : 접근제한자 static 리턴타입 메소드() {}
	//클래스 변수에 접근, 객체와 무관한 작업 수행할 때
	public static int getTotalStudents() {
		return totalStudents;
	}
	
	//리턴값이 없는 클래스 메소드
	public static void printTotalStudents() {
		System.out.println("총 학생의 수 : " + totalStudents);
	}
	
	
	public static void main(String[] args) {
		
		InstanceVariable stu1 = new InstanceVariable(10);
		InstanceVariable stu2 = new InstanceVariable(20);
		
		
		System.out.println(InstanceVariable.totalStudents); //static을 쓰지 않았기 때문에 바로 사용 
		
		InstanceVariable.getTotalStudents(); //호출시: 클래스이름.메서드이름()
		System.out.println(totalStudents); //리턴할 때 어떻게 받겠다고 설정한 값을 인자에 괄호안에 넣는다.
	}
	
}
