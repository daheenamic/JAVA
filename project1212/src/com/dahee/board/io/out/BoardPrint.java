package com.dahee.board.io.out;

import java.util.List;

import com.dahee.board.vo.BoardVO;

public class BoardPrint {
	public static void print(List<BoardVO> list) {
		System.out.println("\n-----------------------------");
		System.out.println("번호 | 제목 | 작성자 | 작성일 | 조회수");
		System.out.println("-----------------------------");
		
		for (BoardVO vo : list) {
			System.out.print(" " + vo.getNo());
			System.out.print(" | " + vo.getTitle());
			System.out.print(" | " + vo.getWriter());
			System.out.print(" | " + vo.getWriteDate());
			System.out.print(" | " + vo.getHit());
			System.out.println();
		}
	}
	
	public static void print(BoardVO vo) {
		System.out.println("게시판 내용 입니다.");
	}
	
	public static void print(Long no) {
		System.out.println(no + "번글 입니다.");
	}

}
