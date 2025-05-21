package Class_practice;

public class Calculator2 {

	
	private int x;
	private int y;
	
	public Calculator2(int x, int y) {
		this.x = x;
		this.y = y;
			
	}

	public int getX() {
		return x;
	}

	//x의 값을 설정하는 메서드
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	//y의 값을 설정하는 메서드
	public void setY(int y) {
		this.y = y;
	}
	
	

	public void itemList() {
		System.out.println("클래스 멤버 변수 x:" + this.x);
		System.out.println("클래스 멤버 변수 y:" + this.y);
	}
	

	//객체 생성
	public static void main(String[] args) {
		Calculator2 cal1 = new Calculator2(2, 3);
		cal1.itemList();
	}
}
