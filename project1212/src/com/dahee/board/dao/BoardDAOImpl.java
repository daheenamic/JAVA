package com.dahee.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.dahee.board.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> list() {
		List<BoardVO> list = null;
		list = new ArrayList<>();
		for (int i=1; i<=5; i++) {
			BoardVO vo = new BoardVO();
			vo.setNo(6-i);
			vo.setTitle("게시판"+i);
			vo.setWrite("작성자"+i);
			vo.setWriteDate("2022-12-12");
			vo.setHit(0);
			list.add(vo);
		}
		return list;
	}

	@Override
	public BoardVO view(Long no) {
		return null;
	}

	@Override
	public Integer write(BoardVO vo) {
		return null;
	}

	@Override
	public Integer update(BoardVO vo) {
		return null;
	}

	@Override
	public Integer delete(Long no) {
		return null;
	}

}
