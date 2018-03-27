<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- 编码类型必须要设置 不设置上传不了 -->
<s:form action="fileUpload" method="post" enctype="multipart/form-data">
	<s:file name="myFile" label="请选择要上传的文件"/>
	<s:submit/>
</s:form>
</body>
</html>