package com.dahee.notice.service;

import com.dahee.main.ServiceInterface;
import com.dahee.notice.dao.NoticeDAO;
import com.dahee.notice.dao.NoticeDAOImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeViewServiceImpl implements ServiceInterface{

	// 넘어가는 데이터는 Long 타입의 글번호
	// NoticeVO : 리턴타입 (글 한개라서 List가 아님)
	@Override // 상속받아서 재정의
	public NoticeVO service(Object obj) {
		Long no = (Long)obj;
		System.out.println("공지 보기를 실행하고 있다.");
		NoticeDAO dao = new NoticeDAOImpl();
		return dao.view(no);
	}
}