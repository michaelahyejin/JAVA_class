package Class_practice;

public class Person {

	//멤버변수를 3개 이상 만들고
	//2개는 생성자로 설정하고
	//나머지는 메서드로 설정하고
	//멤버변수들을 출력하는 메서드를 만들고
	//main문에 객체생성하고 값을 설정, 출력
	
	
	private String name;
	private int age;
	private String gender;
	private String address;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void personInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		
		
	}
	
	
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 20);
		person1.personInfo();
	}
	
	
}
