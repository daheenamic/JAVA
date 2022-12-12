package com.dahee.board.service;

import java.util.List;
import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.main.ServiceInterface;
import com.dahee.board.vo.BoardVO;

public class BoardListServiceImpl implements ServiceInterface {

	@Override
	public List<BoardVO> service(Object obj) {
		BoardDAO dao = new BoardDAOImpl();
		return dao.list();
	}

}
