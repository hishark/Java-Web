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
<title>Dynamic</title>
<sx:head/>
</head>
<body>
<s:url id="train" value="train.action"></s:url>
<s:url id="job" value="job.action"></s:url>
<sx:tabbedpanel id="sanyang" selectedTab="job" closeButton="pane" labelposition="top">
	<!-- train��һ������ ��ʾҪ�����ĸ�action -->
	<sx:div id="train" label="������ѵ" href="%{train}"></sx:div>
	<sx:div id="job" label="�����ҵ" href="%{job}"></sx:div>
</sx:tabbedpanel>

</body>
</html>