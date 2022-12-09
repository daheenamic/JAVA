import java.util.List;

public class BoardListPrint {

	public static void main(String[] args) {
		
		// 게시판 리스트 데이터 가져오기
		BoardDAOImpl dao = new BoardDAOImpl();
		List<BoardVO> list = dao.list();
		
		if(list == null || list.size() == 0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		} // end of if()
		
		// 항목 제목을 출력
		System.out.println("==================================");
		System.out.println("  글번호  |  제목  |  작성자  |  작성일  ");
		System.out.println("==================================");
		
		// 데이터를 출력 - 향상된 for
		for(BoardVO vo : list) {
			System.out.print(" " + vo.getNo());
			System.out.print(" | " + vo.getTitle());
			System.out.print(" | " + vo.getWriter());
			System.out.print(" | " + vo.getWriteDate());
			System.out.println();
	
		} // end of for()
	} // end of main()
} // end of BoardListPrint class
