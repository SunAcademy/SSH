package com.hand.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.services.FilmService;
import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport implements ApplicationContextAware{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String id;
		private String name;
		private File file;
		private String filePath="/UPLOAD";
		private ApplicationContext act;
		private String fileContentType;
		private String fileFileName;
		
		
		@Override
		public String execute() throws Exception {
			
			System.out.println(id);
			System.out.println(name);
			

			File file = new File(filePath,fileFileName);
			
			FileUtils.copyFile(this.file, file);
			
			
			
			return SUCCESS;
		}
		
		@Override
		public void validate() {
		// TODO Auto-generated method stub
			
			System.out.println("valuate");
			if(!name.equals("张三")){
				
				addFieldError("name","傻逼");
				addFieldError("id", "fdsafasfasfsw");
				
			}

		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
		
	
		public String getFileContentType() {
			return fileContentType;
		}
		public void setFileContentType(String fileContentType) {
			this.fileContentType = fileContentType;
		}
		public String getFileFileName() {
			return fileFileName;
		}
		public void setFileFileName(String fileFileName) {
			this.fileFileName = fileFileName;
		}
		public File getFile() {
			return file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public void setApplicationContext(ApplicationContext applicationContext)
				throws BeansException {
			this.act=applicationContext;
			
		}
		
		@org.junit.Test
		public void Test(){
			ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			FilmService filmService=(FilmService) context.getBean("films");
			System.out.println(filmService.listFilms().size()); //先执行一次查询 重新加载 防止二次删除失败
			filmService.delete((short) 24);
			
		}
}
