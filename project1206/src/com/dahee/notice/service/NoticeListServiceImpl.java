package com.dahee.notice.service;

import java.util.List;
import com.dahee.main.ServiceInterface;
import com.dahee.notice.dao.NoticeDAO;
import com.dahee.notice.dao.NoticeDAOImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeListServiceImpl implements ServiceInterface{

	// 현재는 넘겨주는 데이터가 없다. service(null)
	// List<NoticeVO> : 리턴타입 (여러개의 글이라서 List)
	@Override // 상속받아서 재정의
	public List<NoticeVO> service(Object obj) {
		System.out.println("공지 리스트를 실행하고 있다");
		// 클래스를 생성해서 인터페이스에 넣는다.
		NoticeDAO dao = new NoticeDAOImpl();
		return dao.list();
	}
} 