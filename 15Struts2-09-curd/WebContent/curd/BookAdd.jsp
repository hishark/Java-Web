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
   <s:form  action="Store" method="post" >
     <s:textfield name="book.isbn"  label="isbn"></s:textfield>
     <s:textfield name="book.title" label="title"></s:textfield>
     <s:textfield name="book.price" label="price"></s:textfield>
     <s:submit value="����"></s:submit>
     
   </s:form>
   
   <a href='<s:url action="Page"><s:param name="pageNow" value="1" /></s:url>'>���� </a>

   
   </div>
  </body>
</html>
