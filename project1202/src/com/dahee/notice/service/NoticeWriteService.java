package com.dahee.notice.service;

import com.dahee.notice.dao.NoticeDAO;

import com.dahee.notice.vo.NoticeVO;

public class NoticeWriteService {
	
	public int service(NoticeVO vo) {
	
		//생성하고 호출한다.
		NoticeDAO dao = new NoticeDAO();
		return dao.write(vo);
	}

}
