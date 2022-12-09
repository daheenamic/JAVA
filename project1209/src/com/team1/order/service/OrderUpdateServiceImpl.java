package com.team1.order.service;

import com.team1.main.ServiceInterface;
import com.team1.order.dao.OrderDAO;
import com.team1.order.dao.OrderDAOImpl;
import com.team1.order.vo.OrderVO;

public class OrderUpdateServiceImpl implements ServiceInterface {

	@Override
	public Integer service(Object obj) {
		OrderDAO dao = new OrderDAOImpl();
		return dao.update((OrderVO)obj);
	}
}