package Class_practice;

public class Constructor {

	//기본생성자
	//아이디설정 생성자
	//아이디와 비밀번호설정 생성자
	//아이디와 비밀번호

	//기본생성자
	private String name;
	private String userId;
	private String userPw;
	private int age;
	private String address;
	
	public Constructor() {
		this.name = "";
		this.userId = "";
		this.userPw = "";
		this.age = 0;
		this.address = "";
		
	}
	
	//아이디설정 생성자
	public Constructor(String userId) {
		this.name = "";
		this.age = 0;
		this.address = "";
		this.userId = userId;
	    this.userPw = "";
	}
	
	//아이디와 비밀번호 생성자
	public Constructor(String userId, String userPw) {
		this.name = "";
		this.age = 0;
		this.address = "";
		this.userId = userId;
	    this.userPw = userPw;
	}
	
	public Constructor(String name, String userId, String userPw, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.userId = userId;
	    this.userPw = userPw;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("아이디: " + userId);
		System.out.println("주소: " + address);
		System.out.println("나이: " + age);
		System.out.println("비밀번호: " + userPw);
		
	}
	
	
	
	
}
