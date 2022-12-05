package com.dahee.notice.dao;

import java.util.List;

import com.dahee.notice.vo.NoticeVO;

public class NoticeDAO {
	
	// 공지 리스트
	public List<NoticeVO> list() {
		
		System.out.println("\nNoticeDAO.list() .................");
		
		// SQL 쿼리 출력 - 데이터가 여러개가 나온다 - List 객체 (noticeVO가 여러개가 들어있다.)
		System.out.println("SQL : SELECT no, title, startDate, endDate");
		System.out.println("FROM notice");
		System.out.println("ORDER BY updateDate DESC");
		return null;
	} // end of list
	
	// 공지 보기
	
	// 공지 쓰기 - 제목, 내용, 시작일, 종료일 : NoticeVO - 리턴타입은 int
	public int write(NoticeVO vo) {
		System.out.println("\nNoticeDAO.write().vo : " + vo + "..............");
		
		// SQL 출력 해 보기
		System.out.println("SQL : INSERT INTO notice (no, title, content, startDate, endDate)");
		System.out.println("VALUES (notice_seq.nextval, '" + vo.getTitle() + "', '" 
		+ vo.getContent() + "', '" + vo.getStartDate() + "', '" + vo.getEndDate() + "')"  );
		return 1;
	} // end of write
} // end of NoticeDAO class
