package com.team1.order.vo;

public class OrderVO {
	
	private long orderNo;
	private String goodName;
	private long each;
	private String price;
	private String buyerName;
	private String orderDate;
	private String pw;

	public String toString() {
		return "OrderVo[orderNo=" +  orderNo + ", goodName=" + goodName + ", each=" + each
				+ ", price= " + price + ", buyerName=" + buyerName + ", orderDate=" + orderDate
				+ ", pw=" + pw + "]";

	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public long getEach() {
		return each;
	}

	public void setEach(long each) {
		this.each = each;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	} 
} 
