
public class BoardMain {

	public static void main(String[] args) {
		
		// BoardVO를 사용하려고 한다.
		BoardVo vo = new BoardVo();
		vo.setTitle("setter를 이용한 게시판");
		System.out.println(vo);
		System.out.println();
		
		BoardVo vo1 = new BoardVo();
		System.out.println(vo1);
		System.out.println();
		
		BoardVo vo2 = new BoardVo(2, "게시판입니다.", "게시판입니다.");
		System.out.println(vo2);
		System.out.println();
		
		BoardVo vo3 = new BoardVo(3, "게시판입니다.", "게시판입니다.",'A', true);
		System.out.println(vo3);

	}

}
