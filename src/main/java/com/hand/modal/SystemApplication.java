package com.hand.modal;

import org.springframework.context.ApplicationContext;

public class SystemApplication {
	
	private static ApplicationContext applicationContext;

	public static  ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public  static void setApplicationContext(ApplicationContext applicationContext) {
		SystemApplication.applicationContext = applicationContext;
	}
	
	
}
