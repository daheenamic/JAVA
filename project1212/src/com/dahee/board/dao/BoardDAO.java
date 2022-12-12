package com.dahee.board.dao;

import java.util.List;

import com.dahee.board.vo.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> list();
	
	public BoardVO view(Long no);
	
	public Integer write(BoardVO vo);
	
	public Integer update(BoardVO vo);
	
	public Integer delete(Long no);

}
