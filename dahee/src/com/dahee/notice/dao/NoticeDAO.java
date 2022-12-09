package com.dahee.notice.dao;

import java.util.List;
import com.dahee.notice.vo.NoticeVO;

public interface NoticeDAO {
	
	// 1. list
	public List<NoticeVO> list();
	
	// 2. view
	public NoticeVO view(Long no);
	
	// 3. write
	public Integer write(NoticeVO vo);
	
//	// 4. update
//	public Integer update();
	
//	// 5. delete
//	public Integer delete();

}
