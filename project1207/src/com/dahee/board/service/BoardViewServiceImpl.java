package com.dahee.board.service;

import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.vo.BoardVO;
import com.dahee.main.ServiceInterface;

public class BoardViewServiceImpl implements ServiceInterface{

	@Override
	public BoardVO service(Object obj) {
		Long no = (Long)obj;
		System.out.println("게시판 보기를 실행하고 있다");
		BoardDAO dao = new BoardDAOImpl();
		dao.view(no);
		return null;
	}

}
