<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    
<!-- 该标签指令用于导入标签库  uri是导入东西的路径   prefix表示你用的标签必须是s开头-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>用户注册</title>
</head>
<body>
<div align="center">
<s:form name="regForm" action="regAction" method="post">
<s:textfield label="用户名" name="user.userName" title="请输入用户名！"/>
<s:password label="密    码" name="user.passWord" title="请输入密码！"/>
<s:textfield label="年    龄" name="user.age" title="请输入年龄！"/>
<s:radio label="性    别" name="user.sex" list="#{'nan':'男','nv':'女'}" value="{'男'}"/><!--list里用的ognl 前面是不显示的，提交给服务器的。后面的是显示出来的。如果只写一个''的话，那么显示出来的和提交给服务器的是同一个。 -->
<s:checkboxlist label="爱    好" name="user.hobbys" list="#{'0':'篮球','1':'足球','2':'排球'}" value="{'0'}"/>
<s:select label="班    级" name="user.cls" list="#{'0':'15移动','1':'14移动','2':'13移动'}"></s:select>
<s:textarea label="个人简介" name="user.remark" cols="20" rows="5"></s:textarea>
<s:submit value="注    册"></s:submit>
<s:reset value="重    置"></s:reset>
</s:form>
</div>
</body>
</html>