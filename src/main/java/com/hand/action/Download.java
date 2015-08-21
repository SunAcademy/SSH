package com.hand.action;

import java.io.FileInputStream;
import java.io.InputStream;



import org.apache.struts2.ServletActionContext;



import com.opensymphony.xwork2.ActionSupport;

//文件下载
public class Download extends ActionSupport{
	
	

	private String fileName;


	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	//返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个 输出流
	public InputStream getDownloadFile() throws Exception
	{

		   this.fileName = "eclipse-jee-mars-R-macosx-cocoa-x86_64.tar.gz" ;
		//   System.out.println(ServletActionContext.getServletContext().getResourceAsStream("D:/x.xml"));
		   InputStream inputStream= new FileInputStream("D:/test/SSH/src/main/webapp/eclipse-jee-mars-R-macosx-cocoa-x86_64.tar.gz");
		   return inputStream;

		

	}
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

}
