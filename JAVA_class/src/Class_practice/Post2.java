package Class_practice;

public class Post2 {

	private int postId;
	private String title;
	private String contents;
	private String author;
	private String createdAt;
	private int view = 0;
	
	//생성자를 통해 제목과 내용을 초기화하는 코드 작성
	public Post2(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
	//게시글의 제목과 내용을 반환하는 인스턴스 메서드 작성
	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	//총 게시글을 관리하는 클래스 변수를 선언하고, 이를 반환하는 클래스 메소드를 생성하고
	public static int getTotalPost() {
		return totalPost;
		
	}
	
	//게시글 정보를 출력하는 메서드 혹은 출력문 작성
	public void totalPost() {
		System.out.println("제목: " + this.title);
		System.out.println("내용: " + this.contents);
		System.out.println("게시글번호: " + this.postId);
		System.out.println("작성자: " + this.author);
		System.out.println("작성일: " + this.createdAt);
		System.out.println("조회수: " + this.view);
		
	}
	
	
	public static void main(String[] args) {
		Post2 p1 = new Post2("객체와 클래스", "객체 생성과 클래스 변수 실습"); //게시글 객체를 생성하고
		
		p1.setPostId(1); 
	
		
	}
	
	//총 게시글을 출력하는 클래스 메소드를 만들고 출력
	
	
	
	
		
		

		

	
	
	
	
	
	
	

	
}
