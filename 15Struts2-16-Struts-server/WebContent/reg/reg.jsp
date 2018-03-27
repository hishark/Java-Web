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
<div align="center">
  <s:url id="check" value="/checkUser.action" />
  <s:form id="regForm" action="regAction" method="post" >
     <s:textfield label="用户名" name="user.userName" title="请输入用户名！"/>
     <td><sx:a href="%{check}" formId="regForm" targets="receiveRsult">查一查</sx:a></td>
     <td><sx:div id="receiveRsult" theme="simple"></sx:div></td>
     <s:textfield label="密    码" name="user.passWord" title="请输入密码！"/>
     <s:textfield label="年    龄" name="user.age" title="请输入年龄！"/>
     <s:radio label="性    别" name="user.sex" list="#{'nan':'男','nv':'女'}" value="{'nan'}"/>
     <s:checkboxlist label="爱    好" name="user.hobbys" list="#{'0':'篮球','1':'足球','2':'排球'}" value="{'0'}"/>
     <s:select label="班    级" name="user.cls" list="#{'0':'15移动','1':'15技术','2':'15测试'} "/>
     <s:textarea label="个人简介" name="user.remark" cols="20" rows="5" />
     <s:submit value="注册"/>
     <s:reset value="重置"/>
  </s:form>
</div>
</body>
</html>