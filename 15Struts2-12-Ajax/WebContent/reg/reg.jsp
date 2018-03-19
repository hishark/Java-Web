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
<title>用户注册</title>

<!-- 不要忘记这个头部 不然ajax就不起作用了 -->
<sx:head/>

</head>

<body>
<div align="center">
<!-- 定义一个变量 -->
<s:url id="check" value="checkUser.action"></s:url>
<s:form id="regForm" action="regAction" method="post">
<s:textfield label="用户名" name="user.userName" title="请输入用户名！"/>
<!-- 
    加一个链接check一下
    提交给哪个action（href里的）处理  
 
 formId 指定是哪个表单
    结果返回到哪里，由targets决定。
    插入进div的是一个jsp页面
-->
<td><sx:a href="%{check}" formId="regForm" targets="receiveResult">check</sx:a></td>
<td><sx:div id="receiveResult" theme="simple"></sx:div></td>
<!-- 看起来页面没变没提交给服务器 实际上是提交了的   -->

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