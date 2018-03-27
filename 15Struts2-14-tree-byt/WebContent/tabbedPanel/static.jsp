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
<sx:tabbedpanel id="tab" 
     selectedTab="B" closeButton="pane" labelposition="top">
   
   <sx:div id="A" label="AAAA">
   AAAAAA<br>
       AAAA
       <br>
       <br>
       <br>
       <br>
   </sx:div>
   <sx:div id="B"  label="BBBB">
   BBBBB<br>
       BBBBB
       <br>
       <br>
       <br>
       <br>
   </sx:div>
   <sx:div id="C" label="CCCC">
   CCCC<br>
       CCCCC
       <br>
       <br>
       <br>
       <br>
   </sx:div>
   <sx:div id="D" label="DDDD">
       DDDDD<br>
       DDDDDD<br>
       <br>
       <br>
       <br>
       <br>
   </sx:div>
</sx:tabbedpanel>
</body>
</html>