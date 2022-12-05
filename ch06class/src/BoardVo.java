// 게시판 저장 객체
// 저장 항목 : 번호, 제목, 내용

public class BoardVo {

// [3번째 - 메모리에 올라가서 실행되는 순서]
	// private 변수 선언 - 다른 클래스에서 접근이 안됨
	// 객체 변수, 속성(attribute = field = item), 멤버 변수
	// static이 없음 : new 해서 사용되는 변수. -> 인스턴스 변수 : non-static. new 할 때 마다 올라간다.
	// 객체의 멤버 변수는 생성을 하면서 생긴다. 값을 넣지 않더라도 기본 값으로 세팅 해 줌.
	// 기본값 : 숫자-0, String-null, char-공백문자, boolean-false\
	// 메서드 안의 변수들은 생성하면서 생기지 않고 메서드를 호출해서 실행하는 중에 생기기 때문에 반드시 초기값을 세팅 해야 함.
	private long no; // 기본값이 0 - 묵시적 초기값
	private String title = "제목"; // 기본값이 null로 세팅된 후 초기값으로 정의된 "제목"이 들어간다. - 명시적 초기값
	private String content;
	private char grade;
	private boolean update;

// [1번째	- 메모리에 올라가서 실행되는 순서]
	// static이 있다. 클래스 이름이 나오면 자동적으로 메인메모리에 올라간다. BoardVo.serialNo
	// BoardVo.serialNo : 클래스이름.static변수명 -> 클래스 변수
	static private int serialNo; 
	
// [2번쨰 - 메모리에 올라가서 실행되는 순서]
	// 초기화 블록은 안에서 값이 이미 정해져 있을 때 사용한다.
	// static 초기화 블록 - static 변수의 값을 초기화 시키기 위해서 사용.
	static {
		System.out.println("BoardVo.static 초기화 블록 ----------------");
		serialNo = 1;
	// no = 1; // 에러. static 변수가 아님
	}

// [4번째 - 메모리에 올라가서 실행되는 순서]
	// 초기화 블록 - non-static 변수의 값을 초기화 시키기 위해서 사용. (static 변수 값도 변경 가능하다.)
	{ 
		System.out.println("BoardVo 초기화 블록 ----------------");
		no = 1;
		serialNo++; // static 변수의 값도 변경이 가능
	}
	
	// 생성자 : 외부에서 초기값을 전달해서 세팅하고 싶을때 만듦.
	// 전달되는 값이 없는 기본 생성자 -> 초기화 블록 대신 사용 가능하다. parameter(매개변수)가 없다.
	public BoardVo() { // 특별한 메서드. 리턴 타입이 없어서 주소가 리턴된다.
		// 현재 부모 클래스는 object이기 때문에 object는 사용 할 수 없으므로 이 사이에는 처리문을 쓰면 오류가 난다.
		super(); // 없어도 자동으로 들어가게 된다. -> 부모 클래스 (Object)를 생성해라. - 부모클래스의 생성자 호출. 
		System.out.println("BoardVo.부모객체생성 ---------------------");
		System.out.println("BoardVo.기본생성자 ---------------------");
		content = "내용";
	}
	
// [5번째 - 메모리에 올라가서 실행되는 순서]
	// 처음 데이터 만들 때 번호, 제목, 내용은 꼭 나오게 생성하고 싶다.
	// 오버로딩. parameter(매개변수)가 있다.
	// 사용 방법 : new BoardVo(번호, 제목, 내용)
	 // 특별한 메서드. 리턴 타입이 없어서 주소가 리턴된다.
	public BoardVo(long no, String title, String content) {
		System.out.println("BoardVo.생성자(no,title,content)-----------");
		this.no = no;
		this.title = title;
		this.content = content;
	}
	
	// 처음 데이터 만들 때 번호, 제목, 내용, 등급, 수정
	// 오버로딩. parameter 값을 다르게 함.
	// 사용 방법 : new BoardVo(번호, 제목, 내용, 등급, 수정)
	// 특별한 메서드. 리턴 타입이 없어서 주소가 리턴된다.
	public BoardVo(long no, String title, String content, char grade, boolean update) {
		// BoardVo(long no, String title, String Content) 생성자 호출해서 해결 - 중복된 코드는 작성하지 않는다.
		this(no, title, content);
		System.out.println("BoardVo.생성자(no,title,content,grade,update)---------");
		this.grade = grade;
		this.update = update;
	}
	
	// 처음 데이터 만들 때 제목,내용
	// 오버로딩. parameter 값을 다르게 함.
	// 사용 방법 : new BoardVo(제목, 내용) -> this(번호,제목,내용) 생성자를 활용해 보기.
	public BoardVo(String title, String content) {
//		this(0, title, content); 			  // 전달되는 값은 값은 그대로 전달하고 나머지는 기본값으로 세팅
		this(0, title, content, ' ', false);  // this(번호, 제목, 내용, 등급, 수정); 활용하는 코드
	}
	
	
// [6번째 - 메모리에 올라가서 실행되는 순서]	
	// method : 호출할 때 마다 실행이 된다. 실행이 안 될 수도 있음.
	// getter, setter (setter를 안 쓰려면 생성자를 사용하면 된다. 대신 setter가 없으면 중간에 데이터 수정 불가능.)
	public long getNo() {
		return no;
	}	
	public void setNo(long no) {
//		this.no = no;
		if (no>0) this.no = no;
		else System.out.println("no 데이터(" + no + ")는 오류가 있습니다. 음수 데이터는 사용할 수 없습니다.");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
//	public boolean isUpdate() { // boolean 타입은 get 대신에 is를 사용한다.
//		return update;
//	}
	public String isUpdate() { 						   // return 타입을 String으로 변경 해야 한다.
		return (update)?"수정이 되었다.":"수정이 되지 않았다."; // 리턴 하는 값이 "수정이 되었다: 수정이 되지 않았다"기 때문에
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	
	// 그 외 메서드

	// 데이터 확인용 메서드 - toString() : Object에 있는 선언된것과 똑같이 선언.
	// -> 똑같이 선언 됐는지 annotation으로 확인 : @Override
	// 객체를 출력할 때 자동으로 호출 당해서 문자열로 만들어주는 메서드.
	@Override
	public String toString() {
		System.out.println("BoardVo.toString() --------------------- ");
		return "BoardVo [no = " + no + ", title = " + title + ", content = " + content + ", grade = '" + grade
				+ "' , update = " + update + ", serialNo = " + serialNo + "]";
	}
}
