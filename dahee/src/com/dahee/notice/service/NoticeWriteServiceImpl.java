package com.dahee.notice.service;

import com.dahee.main.ServiceInterface;
import com.dahee.notice.dao.NoticeDAO;
import com.dahee.notice.dao.NoticeDAOImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeWriteServiceImpl implements ServiceInterface{

	@Override
	// (Object obj) -> NOticeVo vo
	public Integer service(Object obj) {
		NoticeDAO dao = new NoticeDAOImpl();
		return dao.write((NoticeVO)obj);
	}
}