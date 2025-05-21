package Class_practice;

public class Post {

	private int postNum;
	private String title;
	private String contents;
	private String userName;
	private String notice;
	
	
	//생성자로 postID와 title을 설정하는 것
	//contents를 메서드로 값을 설정하는 코드 작성
	//main문에서 출력
	
	public Post(int postNum, String title) {
		this.postNum = postNum;
		this.title = title;
	}	
	
	public void setContents(String contents) {
		this.contents = contents;
		
	}
	
	public void postList() {
		System.out.println("포스트 번호: " + this.postNum);
		System.out.println("포스트 제목: " + this.title);
	}
		
	
	
	public static void main(String[] args) {
		Post post1 = new Post(1, "클래스 연습");
		post1.postList();
		
	}
	
}
