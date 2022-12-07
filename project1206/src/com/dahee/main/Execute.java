package com.dahee.main;

public class Execute {
	
	// 서비스를 실행하고 싶다. Excute.run (서비스객체, 전달 변수) { 처리문 }
	// public static service를 실행하는 run 메서드 만들기
	
	// Object : 리턴타입
	// run : 메서드 이름
	
	public static Object run(ServiceInterface service, Object obj) {
		System.out.println("\n***********************************");
		// 실행되는 클래스 이름 출력
		System.out.println("* 실행되는 클래스명 : " + service.getClass().getSimpleName());
		
		// 전달해 주는 데이터
		System.out.println("* 전달되는 데이터 : " + obj);
		
		// 서비스 실행
		// Object : 실행 할 때의 타입과 맞춰 준다
		System.out.println("+----------<< 실행 >>----------+");
		// 어떤 객체가 들어왔느냐에 따라서 다르게 실행이 된다.
		Object result = service.service(obj);
		System.out.println("+-----------------------------+");
		
		// 실행 결과 출력
		System.out.println("* 실행 결과 : " + result);
		System.out.println("***********************************");
		
		// 실행 결과 리턴
		return result;
	}

}
