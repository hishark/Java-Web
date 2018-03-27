<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'BookAdd.jsp' starting page</title>
    
  </head>
  
  <body>
  <div align="center">
  edit book <br>
   <s:form  action="bookUpdate" method="post">
     <s:hidden name="book.bookId"/>
     <s:textfield name="book.isbn"  label="isbn"></s:textfield>
     <s:textfield name="book.title" label="title"></s:textfield>
     <s:textfield name="book.price" label="price"></s:textfield>
     <s:submit value="提交"></s:submit>
   </s:form>
    <a href='Page.action'>返回</a>
   <a href='<s:url action="Page"><s:param name="pageNow" value="1" /></s:url>'>返回 </a>
   <s:a href="Page">返回</s:a>
   </div>
  </body>
</html>
