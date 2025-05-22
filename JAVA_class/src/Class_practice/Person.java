package Class_practice;

public class Person {

	//멤버변수를 3개 이상 만들고
	//2개는 생성자로 설정하고
	//나머지는 메서드로 설정하고
	//멤버변수들을 출력하는 메서드를 만들고
	//main문에 객체생성하고 값을 설정, 출력
	
	//맴버변수 생성
	private String name;
	private int age;
	private String gender;
	private String address;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void personInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("성별: " + this.gender);
		System.out.println("주소: " + this.address);
		
	}
	
	
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 20);
		person1.setGender("남자");
		person1.setAddress("대전");
		
		person1.personInfo();
		
	}
	
	
}
