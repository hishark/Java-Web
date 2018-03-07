<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!-- 该标签指令用于导入标签库  uri是导入东西的路径   prefix表示你用的标签必须是s开头-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- 怎么把数据显示出来 这里用到ognl表达式？ -->
在regResult.jsp中的用户名和密码是：<br>
<!-- 括号里必须是login里的变量名 -->
${user.userName}<br>
${user.passWord}<br>

<!-- 使用struts标签 -->
性别：<s:property value="user.sex"/>
<!-- 迭代 -->
你的爱好是：<s:iterator value="user.hobbys">
			<s:property/>
		</s:iterator>
你的第二个爱好是：<s:property value="#request.user.hobbys[1]"/>
个人简介：${requestScope.user.remark}
</body>
</html>