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
	   label="���һ���򵥵����������б��"
	   labelposition="top"
	   name="name"
	   list="{'������ѵ','������ҵ'}"
	   
	   doubleName="dName"   
	   doubleList="top=='������ѵ'?{'�ϲ�','�人'}:{'����','�Ϻ�'}" 
	   doubleSize="3">
	</s:doubleselect>

</s:form>

</body>
</html>