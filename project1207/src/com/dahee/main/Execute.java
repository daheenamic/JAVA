package com.dahee.main;

public class Execute {
	

	public static Object run(ServiceInterface service, Object obj) {
		System.out.println("\n***********************************");
		
		System.out.println("* 실행되는 클래스명 : " + service.getClass().getSimpleName());
		System.out.println("* 전달되는 데이터 : " + obj);
		
		System.out.println("+----------<< 실행 >>----------+");
		Object result = service.service(obj);
		System.out.println("+-----------------------------+");
		
		System.out.println("* 실행 결과 : " + result);
		
		System.out.println("***********************************");
		
		return result;
	}

}
