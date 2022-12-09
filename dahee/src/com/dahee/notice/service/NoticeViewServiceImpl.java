package com.dahee.notice.service;

import com.dahee.main.ServiceInterface;
import com.dahee.notice.dao.NoticeDAO;
import com.dahee.notice.dao.NoticeDAOImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeViewServiceImpl implements ServiceInterface{

	@Override
	// 리턴타입은 Object로 해도 된다. 나중에 형변환 하면 된다.
	public NoticeVO service(Object obj) {
		NoticeDAO dao = new NoticeDAOImpl();
		return dao.view((Long)obj);
	}
}