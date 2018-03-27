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
<title>Insert title here</title>
<sx:head/><!-- 头别忘记啦！！ -->
</head>
<body>
<!-- 
	selectedTab 缺省情况下让什么显示
	closeButton 删除按钮
	labelposition ABCD这些标签显示的位置
 -->
<sx:tabbedpanel id="tab" selectedTab="C" closeButton="pane" labelposition="top">
	
	<!-- label就是显示在顶上的那个标签 -->
	<sx:div id="A" label="AAAA">
		AAAA<br>
		AAAA
	</sx:div>
	
	<sx:div id="B" label="BBBB">
		BBBB<br>
		BBBB
	</sx:div>
	
	<sx:div id="C" label="CCCC">
		CCCC<br>
		CCCC
	</sx:div>
	
	<sx:div id="D" label="DDDD">
		DDDD<br>
		DDDD
	</sx:div>
</sx:tabbedpanel>
</body>
</html>