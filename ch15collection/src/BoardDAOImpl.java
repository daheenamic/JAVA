import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl {
	
	public List<BoardVO> list() {
		List<BoardVO> list = null;
		
		// 데이터를 채운다
		// 데이터가 존재하면 list는 생성해서 넣어둔다.
		list = new ArrayList<>(); // List<BoardVO>와 타입이 같으면 타입은 생략 가능
		
		// 데이터 넣기. -"게시판1"~"게시판5", 작성자 - "홍길동", 비밀번호 - "1111"
		// 리스트에서는 글 내용을 가져오지 않아서 content는 생략한다.
		for(int i=1; i<=5; i++) {
			BoardVO vo = new BoardVO();
			vo.setNo(6-i);
			vo.setTitle("게시판" + i);
			vo.setWriter("홍길동");
			list.add(vo);
		} // end of for
		
//		System.out.println("BoardDAO.list().list : " + list); // 데이터 확인 테스트용
		
		return list;
	} // end of list()
}// end of BoardDAOImpl class
