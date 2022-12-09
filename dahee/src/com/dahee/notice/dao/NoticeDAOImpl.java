package com.dahee.notice.dao;

import java.util.ArrayList;
import java.util.List;
import com.dahee.notice.vo.NoticeVO;

public class NoticeDAOImpl implements NoticeDAO {
	
	public List<NoticeVO> list() {
		List<NoticeVO> list = null;

		// 생성
		list = new ArrayList<>();

		// for문을 이용한 강제 데이터 세팅
		for (int i = 1; i <= 5; i++) {
			NoticeVO vo = new NoticeVO();
			// 데이터를 세팅한다
			vo.setNo(6 - i);
			vo.setTitle("공지" + i);
			vo.setStartDate("2022-12-09");
			vo.setEndDate("2022-12-16");
			vo.setUpdateDate("2022-12-06");
			list.add(vo); // 데이터 세팅이 끝나면 list에 담는다
		} // end of for

		// 데이터 확인용 list가 잘 나오는지 테스트 - 나중에 주석처리
		System.out.println("NoticeDAOImpl.list().list : " + list);
		return list;
	} // end of list()

	public NoticeVO view(Long no) {
		NoticeVO vo = null;

		vo = new NoticeVO();
		vo.setNo(2);
		vo.setTitle("공지2");
		vo.setContent("공지입니다.2");
		vo.setStartDate("2022-12-09");
		vo.setEndDate("2022-12-16");
		vo.setUpdateDate("2022-12-06");

		System.out.println("NoticeDAOImpl.list().vo : " + vo);
		return vo;
	} // end of view()

	public Integer write(NoticeVO vo) {
		Integer result = 0;
		
		// 넘어오는 데이터 확인
		System.out.println("NoticeDAOImpl.write().vo : " + vo);
		
		// DB에 등록한다. 아직 구현 안했으므로 생략.
		result = 1;
		
		return result;
	}
	
} // end of class
