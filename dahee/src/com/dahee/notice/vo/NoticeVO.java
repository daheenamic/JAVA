package com.dahee.notice.vo;

public class NoticeVO {
	
	// private 변수
	// 생성자 (기본 생성자 사용시 생략 가능)
	private long no;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	private String writeDate;
	private String updateDate;
	
	// getter
	public long getNo() {return no;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getStartDate() {return startDate;}
	public String getEndDate() {return endDate;}
	public String getWriteDate() {return writeDate;}
	public String getUpdateDate() {return updateDate;}
	
	// setter
	public void setNo(long no) {this.no = no;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setStartDate(String startDate) {this.startDate = startDate;}
	public void setEndDate(String endDate) {this.endDate = endDate;}
	public void setWriteDate(String writeDate) {this.writeDate = writeDate;}
	public void setUpdateDate(String updateDate) {this.updateDate = updateDate;}

	// toString 메서드
	public String toString() {
		return "NoticeVo[no=" +  no + ", title=" + title + ", content=" + content
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";

	} 
} 
