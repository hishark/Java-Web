<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>增加图书</title>
   
  </head>
  
  <body onload="">
  <div align="center">&nbsp; 
    增加图书 <br>
   <s:form  action="Store" method="post" >
     <s:textfield name="book.isbn"  label="isbn"></s:textfield>
     <s:textfield name="book.title" label="title"></s:textfield>
     <s:textfield name="book.price" label="price"></s:textfield>
     <s:submit value="增加"></s:submit>
     
   </s:form>
   
   <a href='<s:url action="Page"><s:param name="pageNow" value="1" /></s:url>'>返回 </a>

   
   </div>
  </body>
</html>
