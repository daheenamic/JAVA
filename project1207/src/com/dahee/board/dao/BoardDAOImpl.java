package com.dahee.board.dao;

import java.util.List;

import com.dahee.board.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<BoardVO> list() {
		System.out.println("BoardDATOImpl.list().........");
		return null;
		}

	@Override
	public BoardVO view(Long no) {
		System.out.println("BoardDATOImpl.view().........");
		return null;
	}

	@Override
	public Integer write(BoardVO vo) {
		System.out.println("BoardDATOImpl.write().........");
		return null;
	}

	@Override
	public Integer update(BoardVO vo) {
		System.out.println("BoardDATOImpl.update().........");
		return null;
	}

	@Override
	public Integer delete(Long no) {
		System.out.println("BoardDATOImpl.delete().........");
		return null;
	}

}
