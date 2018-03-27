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
<s:form>
   <s:bean id="ds" name="jxnu.edu.cn.x3321.bean.DoubleSelect"></s:bean>
   <s:doubleselect
    label="获得一个简单的连级下拉列表框"
	labelposition="top"
	name="company"
    list="#ds.list"
    listKey="id"
    listValue="name"
     
    doubleName="city"
    doubleList="#ds.map.get(top.id)" 
    doubleListKey="id"
    doubleListValue="name"
    doubleSize="3"/>
   
</s:form>
   

</body>
</html>