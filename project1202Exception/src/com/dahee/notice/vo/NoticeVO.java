package com.dahee.notice.vo;

public class NoticeVO {
	
	// 번호, 제목, 내용, 시작일, 종료일, 작성일, 수정일
	// private 변수로 선언
	private long no;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	private String writeDate;
	private String updateDate;
	
	// 메서드 - getter & setter	
	public long getNo() {return no;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public String getStartDate() {return startDate;}
	public String getEndDate() {return endDate;}
	public String getWriteDate() {return writeDate;}
	public String getUpdateDate() {return updateDate;}
	
	// 생성자는 setter를 이용해서 데이터 세팅 - 기본 생성자 생략 가능 : 컴파일러가 자동 생성.
	public void setNo(long no) {this.no = no;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setStartDate(String startDate) {this.startDate = startDate;}
	public void setEndDate(String endDate) {this.endDate = endDate;}
	public void setWriteDate(String writeDate) {this.writeDate = writeDate;}
	public void setUpdateDate(String updateDate) {this.updateDate = updateDate;}
	
	// 데이터 확인용 toString method
	public String toString() {
		return "NoticeVo[no=" +  no + ", title=" + title + ", content=" + content
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", writeDate=" + writeDate + ", updateDate=" + updateDate + "]";

	} // end of toString	
} // end of NoticeVo class
