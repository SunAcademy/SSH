package com.hand.action;

import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hand.dao.services.FilmService;
import com.hand.modal.SystemApplication;
import com.hand.pojo.Film1;

public class StartAction extends ContextLoaderListener{
	
	private ApplicationContext applicationContext;
	
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub'
		ServletContext context=event.getServletContext();

		super.contextInitialized(event);
		
		ApplicationContext ctx= WebApplicationContextUtils.getWebApplicationContext(context);
		this.applicationContext=ctx;
		
		
		SystemApplication.setApplicationContext(ctx);
		
		FilmService filmService= (FilmService) applicationContext.getBean("films");
		List<Film1> films=filmService.listFilms();
		
		context.setAttribute("films", films);
		


		
		
		
	}

}
