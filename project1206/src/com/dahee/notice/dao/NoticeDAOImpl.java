package com.dahee.notice.dao;

import java.util.List;
import com.dahee.notice.vo.NoticeVO;

// NoticeDAO를 상속받아서 재정의
public class NoticeDAOImpl implements NoticeDAO {

	@Override
	public List<NoticeVO> list() {
		System.out.println("NoticeDATOImpl.list().........");
		return null;
		}

	@Override
	public NoticeVO view(Long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer write(NoticeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(NoticeVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Long no) {
		// TODO Auto-generated method stub
		return null;
	}

}
