package com.dahee.board.service;

import com.dahee.main.ServiceInterface;
import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.vo.BoardVO;


public class BoardUpdateServiceImpl implements ServiceInterface{

	@Override
	public Integer service(Object obj) {
		BoardVO vo = (BoardVO)obj;
		System.out.println("게시판 수정을 실행하고 있다.");
		BoardDAO dao = new BoardDAOImpl();
		return dao.update(vo);
	}

}
