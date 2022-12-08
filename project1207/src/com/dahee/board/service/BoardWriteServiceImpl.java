package com.dahee.board.service;

import com.dahee.board.dao.BoardDAO;
import com.dahee.board.dao.BoardDAOImpl;
import com.dahee.board.vo.BoardVO;
import com.dahee.main.ServiceInterface;

public class BoardWriteServiceImpl implements ServiceInterface{

	@Override
	public Integer service(Object obj) {
		BoardVO vo = (BoardVO) obj;
		System.out.println("게시판 등록을 실행하고 있다.");
		BoardDAO dao = new BoardDAOImpl();
		return dao.write(vo);
	}

}
