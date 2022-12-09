package com.team1.order.dao;

import java.util.List;
import com.team1.order.vo.OrderVO;

public interface OrderDAO {
	
	// 1. list
	public List<OrderVO> list();
	
	// 2. view
	public OrderVO view(Long no);
	
	// 3. write
	public Integer write(OrderVO vo);
	
	// 4. update
	public Integer update(OrderVO vo);
	
	// 5. delete
	public Integer delete(Long no);

}
