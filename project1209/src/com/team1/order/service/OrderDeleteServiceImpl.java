package com.team1.order.service;

import com.team1.main.ServiceInterface;
import com.team1.order.dao.OrderDAO;
import com.team1.order.dao.OrderDAOImpl;

public class OrderDeleteServiceImpl implements ServiceInterface {

	@Override
	public Integer service(Object obj) {
		OrderDAO dao = new OrderDAOImpl();
		return dao.delete((Long)obj);
	}
}