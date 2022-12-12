package com.dahee.board.main;

public class Execute {
	public static Object run(ServiceInterface service, Object obj) {
		return service.service(obj);
	}
}
