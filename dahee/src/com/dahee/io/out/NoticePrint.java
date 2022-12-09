package com.dahee.io.out;

import java.util.List;

import com.dahee.main.Main;
import com.dahee.notice.vo.NoticeVO;

public class NoticePrint {

	public static void print(List<NoticeVO> list) {
		System.out.println("\n-----------------------------------");
		System.out.println("번호  |     제목     |  시작일  |  종료일");
		System.out.println("-----------------------------------");

		if (list == null || list.size() == 0) {
			System.out.println("데이터가 존재하지 않습니다.");
			System.out.println("----------------------------------");
			return;
		} // end of if

		for (NoticeVO vo : list) {
			System.out.print(" " + vo.getNo());
			System.out.print(" | " + vo.getTitle());
			System.out.print(" | " + vo.getStartDate());
			System.out.print(" | " + vo.getEndDate());
			System.out.println();
		} // end of for

		System.out.println("----------------------------------");
	} // end of print(List<NoticeVO> list)

	public static void print(NoticeVO vo) {
		if (vo == null) {
			System.out.println("데이터가 존재하지 않습니다.");
			System.out.println("----------------------------------");
			return;
		} // end of if

		System.out.println("\n-----------------------------------");
		System.out.println("- 번호 : " + vo.getNo());
		System.out.println("- 제목 : " + vo.getTitle());
		System.out.println("- 내용 : " + vo.getContent());
		System.out.println("- 시작일 : " + vo.getStartDate());
		System.out.println("- 종료일 : " + vo.getEndDate());
		System.out.println("- 작성일 : " + vo.getUpdateDate());
		System.out.println("-----------------------------------");
	} // end of print(NoticeVO vo)
	


} // end of NoticePrint class
