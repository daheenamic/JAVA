package com.dahee.notice.service;

import com.dahee.main.ServiceInterface;
import com.dahee.notice.dao.NoticeDAO;
import com.dahee.notice.dao.NoticeDAOImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeWriteServiceImpl implements ServiceInterface{

	// 넘어가는 데이터는 Vo
	// Integer : 리턴타입
	@Override // 상속받아서 재정의
	public Integer service(Object obj) {
		NoticeVO vo =(NoticeVO) obj;
		System.out.println("공지 쓰기를 실행하고 있다.");
		NoticeDAO dao = new NoticeDAOImpl();
		return dao.write(vo);
	}
}