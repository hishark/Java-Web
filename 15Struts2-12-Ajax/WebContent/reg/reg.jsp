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
<title>�û�ע��</title>

<!-- ��Ҫ�������ͷ�� ��Ȼajax�Ͳ��������� -->
<sx:head/>

</head>

<body>
<div align="center">
<!-- ����һ������ -->
<s:url id="check" value="checkUser.action"></s:url>
<s:form id="regForm" action="regAction" method="post">
<s:textfield label="�û���" name="user.userName" title="�������û�����"/>
<!-- 
    ��һ������checkһ��
    �ύ���ĸ�action��href��ģ�����  
 
 formId ָ�����ĸ���
    ������ص������targets������
    �����div����һ��jspҳ��
-->
<td><sx:a href="%{check}" formId="regForm" targets="receiveResult">check</sx:a></td>
<td><sx:div id="receiveResult" theme="simple"></sx:div></td>
<!-- ������ҳ��û��û�ύ�������� ʵ�������ύ�˵�   -->

<s:password label="��    ��" name="user.passWord" title="���������룡"/>
<s:textfield label="��    ��" name="user.age" title="���������䣡"/>
<s:radio label="��    ��" name="user.sex" list="#{'nan':'��','nv':'Ů'}" value="{'��'}"/><!--list���õ�ognl ǰ���ǲ���ʾ�ģ��ύ���������ġ����������ʾ�����ġ����ֻдһ��''�Ļ�����ô��ʾ�����ĺ��ύ������������ͬһ���� -->
<s:checkboxlist label="��    ��" name="user.hobbys" list="#{'0':'����','1':'����','2':'����'}" value="{'0'}"/>
<s:select label="��    ��" name="user.cls" list="#{'0':'15�ƶ�','1':'14�ƶ�','2':'13�ƶ�'}"></s:select>
<s:textarea label="���˼��" name="user.remark" cols="20" rows="5"></s:textarea>
<s:submit value="ע    ��"></s:submit>
<s:reset value="��    ��"></s:reset>
</s:form>
</div>
</body>
</html>