package com.team1.order.service;

import java.util.List;

import com.team1.main.ServiceInterface;
import com.team1.order.dao.OrderDAO;
import com.team1.order.dao.OrderDAOImpl;
import com.team1.order.vo.OrderVO;

public class OrderServiceImpl implements ServiceInterface{

	@Override
	// 리턴타입은 Object로 해도 된다. 나중에 형변환 하면 된다.
	public List<OrderVO> service(Object obj) {
		OrderDAO dao = new OrderDAOImpl();
		return dao.list();
	}
}