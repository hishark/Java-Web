<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!-- �ñ�ǩָ�����ڵ����ǩ��  uri�ǵ��붫����·��   prefix��ʾ���õı�ǩ������s��ͷ-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- action-����������ύ���ĸ�actionȥ����  post-�����ύ����post����ȫ-->
<div align="center">
<s:form action="loginAction" method="post">
<s:textfield label="�û���" name="user.userName" title="�������û�����"/>
<s:password label="��    ��" name="user.passWord" title="���������룡"/>

<!-- ��֤����������� -->
<s:textfield label="��֤��" name="VCode"></s:textfield>
<img id="VCode" src="/15Struts2-10-Wildcards/servlet.VCode">

<s:submit value="��    ¼"></s:submit>
<s:reset value="��    ��"></s:reset>
</s:form>
</div>
</body>
</html>