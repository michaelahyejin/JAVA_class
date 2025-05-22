package Class_practice;

public class Calculator {

	//값을 설정하면 리턴 값이 필요없음
	//값을 반환해줘야 하면 리턴타입 필요함
	//메서드: 접근제한자 리턴타입 메서드명(파라메터) {코드블록}
	
	
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtrac(int x, int y) {
		return x - y;
	}
	
	public int multipl(int x, int y) {
		return x * y;
	}
	
	public int division(int x, int y) {
		return x / y;
	}
	
	
	//메서드 오버로딩
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public int multipl(int x, int y, int z) {
		return x * y * z;
	}
	
	
	
	
	public static void main(String[] args) {
		//클래스타입 변수명 = new 클래스타입(매개변수)
		Calculator cal1 = new Calculator();
		
		//리턴값은 메서드(함수) 호출 지점으로 반환된다.
		int addResult = cal1.add(1, 2);
		System.out.println(addResult);
		
		int addResult2 = cal1.add(1, 2, 3);
		System.out.println(addResult2);
	
		int subtracResult = cal1.subtrac(5, 3);
		System.out.println(subtracResult);
		
		int multiplResult = cal1.multipl(4, 5);
		System.out.println(multiplResult);
		
		int multiplResult2 = cal1.multipl(4, 5, 6);
		System.out.println(multiplResult2);
		
		int divisionResult = cal1.division(10, 5);
		System.out.println(divisionResult);
		
	}
	
}
