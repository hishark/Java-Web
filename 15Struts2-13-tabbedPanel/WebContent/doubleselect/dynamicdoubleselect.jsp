<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!-- �ñ�ǩָ�����ڵ����ǩ��  uri�ǵ��붫����·��   prefix��ʾ���õı�ǩ������s��ͷ-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- ajax�� -->
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>dynamic double select</title>
</head>
<body>
<!-- ��������ͨ��bean�������ݼ��ع��� -->
<s:form>
	<!-- ds����DoubleSelect��ʵ�������� -->
	<s:bean id="ds" name="bean.DoubleSelect"></s:bean>
	<!-- list�Ǽ��� -->
	<s:doubleselect 
		label="���һ���򵥵����������б��"
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