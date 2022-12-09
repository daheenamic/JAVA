package com.dahee.exception;

public class DBException extends Exception {           
	
	// 오류코드를 저장하는 수
	private final int ERROR_CODE = 41;
	
	// 1. 메세지를 생성할 때 전달 받아서 사용하고 싶다.
	public DBException(String message) {
		super(message);
	}
	
	// 2. 정해진 메세지를 전달해서 사용하고 싶다.
	public DBException() {
		super("DB 처리 중 예외가 발생되었습니다.");
	}
	
	// 3. 발생된 예외 객체를 그대로 사용하는 방법.
	public DBException(Exception e) {
		super(e);
	}
	
	// 오류코드를 가져가는 getter
	public int getErrorCode() {
		return ERROR_CODE;
	}
}
