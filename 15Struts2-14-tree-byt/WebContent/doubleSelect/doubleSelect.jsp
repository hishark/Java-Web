<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<s:form >
	<s:doubleselect 
	   label="获得一个简单的连级下拉列表框"
	   labelposition="top"
	   name="name"
	   list="{'三样培训','三样就业'}"
	   
	   doubleName="dName"   
	   doubleList="top=='三样培训'?{'南昌','武汉'}:{'北京','上海'}" 
	   doubleSize="3">
	</s:doubleselect>

</s:form>

</body>
</html>