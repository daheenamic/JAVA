package com.dahee.board.service;

import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.main.ServiceInterface;
import com.dahee.board.vo.BoardVO;

public class BoardViewServiceImpl implements ServiceInterface {

	@Override
	public BoardVO service(Object obj) {
		BoardDAO dao = new BoardDAOImpl();
		return dao.view((Long)obj);
	}

}
