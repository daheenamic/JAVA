package com.dahee.board.service;

import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.main.ServiceInterface;

public class BoardDeleteServiceImpl implements ServiceInterface {

	@Override
	public Integer service(Object obj) {
		BoardDAO dao = new BoardDAOImpl();
		return dao.delete((Long)obj);
	}
}
