<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
在regResult.jsp中的用户名和密码是：
${user.userName}<br>
${user.passWord}<br>
性别：<s:property value="user.sex"/>
你的爱好是：<s:iterator value="user.hobbys">
             <s:property/>
         </s:iterator>
你的第2个爱好是：<s:property value="#request.user.hobbys[1]"/>
个人简介：${requestScope.user.remark}
</body>
</html>