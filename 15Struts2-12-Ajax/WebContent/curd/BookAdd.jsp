<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>����ͼ��</title>
   
  </head>
  
  <body onload="">
  <div align="center">&nbsp; 
    ����ͼ�� <br>
   <s:form  action="book_add" method="post" >
     <s:textfield name="book.isbn"  label="isbn"></s:textfield>
     <s:textfield name="book.title" label="title"></s:textfield>
     <s:textfield name="book.price" label="price"></s:textfield>
     <s:submit value="����"></s:submit>
     
   </s:form>
   
   <!-- <a href='/15Struts2-11-Interceptor/curd/BookList.jsp'>���� </a> -->
<!-- !!!!!!!!!!!!! -->
<a href='<s:url action="page"></s:url>'>���� </a>
   
   </div>
  </body>
</html>
