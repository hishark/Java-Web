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
<title>Insert title here</title>
<sx:head/><!-- ͷ������������ -->
</head>
<body>
<!-- 
	selectedTab ȱʡ�������ʲô��ʾ
	closeButton ɾ����ť
	labelposition ABCD��Щ��ǩ��ʾ��λ��
 -->
<sx:tabbedpanel id="tab" selectedTab="C" closeButton="pane" labelposition="top">
	
	<!-- label������ʾ�ڶ��ϵ��Ǹ���ǩ -->
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