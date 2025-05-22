package Class_practice;

public class MethodReturn {

	
	public void printMessage(String message) {
		System.out.println("메시지: " + message);
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String getGreeting(String name) {
		return "안녕하세요, " + name + "님!";
	}
	
	public int[] getNumbers() {
		return new int[] {1, 2, 3, 4, 5};
	}
	
	public Person createPerson(String name, int age) {
		return new Person(name, age);
	}
	
	public static void main(String[] args) {
		MethodReturn message1 = new MethodReturn();
		message1.printMessage("안녕하세요.");
	
		int result = add(3, 5);
		System.out.println("결과: " + result);
		
		String Greeting = getGreeting("홍길동");
		System.out.println(Greeting);
		
		MethodReturn array = new MethodReturn();
		int[] numbers = array.getNumbers();
		System.out.println(numbers);
		
	}
	
}
