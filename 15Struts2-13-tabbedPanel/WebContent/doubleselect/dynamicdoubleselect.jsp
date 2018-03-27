<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!-- 该标签指令用于导入标签库  uri是导入东西的路径   prefix表示你用的标签必须是s开头-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- ajax库 -->
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>dynamic double select</title>
</head>
<body>
<!-- 现在我们通过bean来把数据加载过来 -->
<s:form>
	<!-- ds就是DoubleSelect的实例化对象 -->
	<s:bean id="ds" name="bean.DoubleSelect"></s:bean>
	<!-- list是集合 -->
	<s:doubleselect 
		label="获得一个简单的连级下拉列表框"
		labelposition=""
		name="company"
		list="#ds.list"
		listKey="id"
		listValue="name"
		 
		doubleName="city"
		doubleList="#ds.map.get(top.id)"
		doubleListKey="id"
		doubleListValue="name"
		doubleSize="3">
		
	</s:doubleselect>
</s:form>
</body>
</html>