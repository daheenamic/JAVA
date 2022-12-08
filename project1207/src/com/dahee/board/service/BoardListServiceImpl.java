package com.dahee.board.service;

import java.util.List;

import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.vo.BoardVO;
import com.dahee.main.ServiceInterface;

public class BoardListServiceImpl implements ServiceInterface{

	@Override
	public List<BoardVO> service(Object obj) {
		System.out.println("게시판 리스트를 실행하고 있다");
		BoardDAO dao = new BoardDAOImpl();
		return dao.list();
	}
} 