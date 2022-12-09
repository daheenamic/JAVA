package com.dahee.notice.dao;

import java.util.List;

import com.dahee.exception.DBException;
import com.dahee.notice.vo.NoticeVO;

public class NoticeDAO {

	/*
	 * 공지 리스트 - DB 연결 클래스 확인 -> DB 연결 -> 실행할 SQL 작성 -> 실행객체를 만들고 SQL을 넣어준다. -> 실행 ->
	 * 표시 / 저장 -> 닫기
	 */
	public List<NoticeVO> list() throws Exception {

		try {

			System.out.println("\nNoticeDAO.list() .................");

			// SQL 쿼리 출력 - 데이터가 여러개 -> List
			System.out.println("SQL : SELECT no, title, startDate, endDate");
			System.out.println("FROM notice");
			System.out.println("ORDER BY updateDate DESC");

			// 강제 예외 발생
		System.out.println(10/0);

			return null;
		} catch (Exception e) {
			// 나름대로의 메세지를 처리하기 위해서 예외를 다시 만든다. 그리고 던진다.
//			throw new Exception("공지사항 DB처리 중 예외가 발생되었습니다.");
			
//			throw new DBException(); // 정해진 에러 코드 메세지를 출력
			throw new DBException(e); // 시스템에서 발생된 예외를 그대로 사용. 생성자가 꼭 있어야 한다.
			
		} // end of try~catch
	} // end of list

	// 공지 쓰기 - 제목, 내용, 시작일, 종료일 : NoticeVO - 리턴타입은 int
	public int write(NoticeVO vo) throws Exception {
		System.out.println("\nNoticeDAO.write().vo : " + vo + "..............");

		// SQL 출력 해 보기
		System.out.println("SQL : INSERT INTO notice (no, title, content, startDate, endDate)");
		System.out.println("VALUES (notice_seq.nextval, '" + vo.getTitle() + "', '" + vo.getContent() + "', '"
				+ vo.getStartDate() + "', '" + vo.getEndDate() + "')");
		return 1;
	} // end of write
} // end of NoticeDAO class
