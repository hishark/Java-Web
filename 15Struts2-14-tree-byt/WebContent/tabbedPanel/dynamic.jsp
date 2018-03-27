<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<sx:head/><!-- 头部一定不能忘记 -->
</head>
<body>
<s:url id="train" value="train.action" />
<s:url id="job" value="job.action" />
<sx:tabbedpanel id="sunyang"
   selectedTab="train" closeButton="pane" labelposition="top">
   <sx:div id="train" label="三杨培训" href="%{train}"></sx:div>
   <sx:div id="job" label="三杨就业"  href="%{job}"></sx:div>
</sx:tabbedpanel>

</body>
</html>