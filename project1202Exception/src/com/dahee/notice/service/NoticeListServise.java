package com.dahee.notice.service;

import java.util.List;

import com.dahee.notice.dao.NoticeDAO;

import com.dahee.notice.vo.NoticeVO;

public class NoticeListServise {
	
	public List<NoticeVO> service() throws Exception{
		
		System.out.println("\nNoticeListServise.service() ...............");
		
		// DB에서 데이터 가져오기 - 여러개 - 리턴타입이 List
		// 생성하고 호출한다.
		NoticeDAO dao = new NoticeDAO();
		return dao.list();
		
	} // end of service

} // end of NoticeListServise class
