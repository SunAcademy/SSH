<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<h2>Hello World!</h2>
<br>

	<s:form action="film"  enctype="multipart/form-data" method="post">
		<s:textfield label="电影ID" name="id"/>
		<s:textfield label="电影名称" name="name"/>
		<s:file label="上传一个文件" name="file"/>
		<s:submit value="submit" label="submit"></s:submit>
	</s:form>
	
	<a href="FileDownload.action">down</a>
	
	<s:property value="#application.films"/>
</body>
</html>
