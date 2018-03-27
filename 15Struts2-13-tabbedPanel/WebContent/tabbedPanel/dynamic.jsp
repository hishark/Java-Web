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
<title>Dynamic</title>
<sx:head/>
</head>
<body>
<s:url id="train" value="train.action"></s:url>
<s:url id="job" value="job.action"></s:url>
<sx:tabbedpanel id="sanyang" selectedTab="job" closeButton="pane" labelposition="top">
	<!-- train是一个变量 表示要调用哪个action -->
	<sx:div id="train" label="三杨培训" href="%{train}"></sx:div>
	<sx:div id="job" label="三杨就业" href="%{job}"></sx:div>
</sx:tabbedpanel>

</body>
</html>