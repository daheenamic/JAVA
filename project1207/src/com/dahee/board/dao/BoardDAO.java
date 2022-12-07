package com.dahee.board.dao;

import java.util.List;

import com.dahee.board.vo.BoardVO;

public interface BoardDAO {
	
	// 1. list
	public List<BoardVO> list();
	
	// 2. view
	public BoardVO view(Long no);
	
	// 3. write
	public Integer write(BoardVO vo);
	
	// 4. update
	public Integer update(BoardVO vo);
	
	// 5. delete
	public Integer delete(Long no);
}
