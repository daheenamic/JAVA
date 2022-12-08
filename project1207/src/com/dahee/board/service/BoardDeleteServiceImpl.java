package com.dahee.board.service;

import com.dahee.main.ServiceInterface;
import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;



public class BoardDeleteServiceImpl implements ServiceInterface{

	@Override
	public Integer service(Object obj) {
		Long no = (Long)obj;
		System.out.println("게시판 삭제를 실행하고 있다.");
		BoardDAO dao = new BoardDAOImpl();
		return dao.delete(no);
	}

}
