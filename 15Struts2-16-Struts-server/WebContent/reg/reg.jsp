<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>

<sx:head/><!-- ͷ��һ���������� -->

</head>
<body>
<div align="center">
  <s:url id="check" value="/checkUser.action" />
  <s:form id="regForm" action="regAction" method="post" >
     <s:textfield label="�û���" name="user.userName" title="�������û�����"/>
     <td><sx:a href="%{check}" formId="regForm" targets="receiveRsult">��һ��</sx:a></td>
     <td><sx:div id="receiveRsult" theme="simple"></sx:div></td>
     <s:textfield label="��    ��" name="user.passWord" title="���������룡"/>
     <s:textfield label="��    ��" name="user.age" title="���������䣡"/>
     <s:radio label="��    ��" name="user.sex" list="#{'nan':'��','nv':'Ů'}" value="{'nan'}"/>
     <s:checkboxlist label="��    ��" name="user.hobbys" list="#{'0':'����','1':'����','2':'����'}" value="{'0'}"/>
     <s:select label="��    ��" name="user.cls" list="#{'0':'15�ƶ�','1':'15����','2':'15����'} "/>
     <s:textarea label="���˼��" name="user.remark" cols="20" rows="5" />
     <s:submit value="ע��"/>
     <s:reset value="����"/>
  </s:form>
</div>
</body>
</html>