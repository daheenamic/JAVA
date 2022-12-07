package com.dahee.notice.dao;

import java.util.List;
import com.dahee.notice.vo.NoticeVO;

// 인터페이스이기 때문에 메서드마다 abstract라고 쓰지 않아도 문제가 없다.
public interface NoticeDAO {
	
	// 1. list
	public /*abstract 생략가능~*/ List<NoticeVO> list();
	
	// 2. view
	public NoticeVO view(Long no);
	
	// 3. write
	public Integer write(NoticeVO vo);
	
	// 4. update
	public Integer update(NoticeVO vo);
	
	// 5. delete
	public Integer delete(Long no);
}
