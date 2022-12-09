package com.team1.order.dao;

import java.util.ArrayList;
import java.util.List;

import com.team1.order.vo.OrderVO;

public class OrderDAOImpl implements OrderDAO {
	
	public List<OrderVO> list() {
		List<OrderVO> list = null;

		// 생성
		list = new ArrayList<>();

		// for문을 이용한 강제 데이터 세팅
		for (int i = 1; i <= 5; i++) {
			OrderVO vo = new OrderVO();
			// 데이터를 세팅한다
			vo.setOrderNo(6 - i);
			vo.setGoodName("주문한 상품");
			vo.setEach(1);
			vo.setPrice("25,000원");
			vo.setBuyerName("정다희");
			vo.setOrderDate("2022-12-09");
			list.add(vo); // 데이터 세팅이 끝나면 list에 담는다
		} // end of for

		return list;
	} // end of list()

	public OrderVO view(Long no) {
		OrderVO vo = null;

		vo = new OrderVO();
		vo.setOrderNo(2);
		vo.setGoodName("주문한 상품");
		vo.setEach(1);
		vo.setPrice("setPrice");
		vo.setBuyerName("정다희");
		vo.setOrderDate("2022-12-09");

		return vo;
	} // end of view()

	public Integer write(OrderVO vo) {
		Integer result = 0;
		// DB에 등록한다. 아직 구현 안했으므로 생략.
		result = 1;		
		return result;
	}

	@Override
	public Integer update(OrderVO vo) {
		Integer result1 = 0;
		result1 = 1;
		return result1;
	}

	@Override
	public Integer delete(Long no) {
		Integer result2 = 0;
		result2 = 1;
		return result2;
	}
	
} // end of class
