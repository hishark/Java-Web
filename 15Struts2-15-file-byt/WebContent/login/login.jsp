<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<s:form action="loginAction" method="post">
  <s:textfield label="�û���" name="user.userName" title="�������û�����"/>
  <s:textfield label="��    ��" name="user.passWord" title="���������룡"/>
  <s:textfield label="��֤��" name="saveCode"/>
  <img id="saveCode" src="servlet.saveCode">
  <s:submit value="��¼"/>
  <s:reset value="����"/>
</s:form>
request.getParamter("userName");
</div>
</body>
</html>