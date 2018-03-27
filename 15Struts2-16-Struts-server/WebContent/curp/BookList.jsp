<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html>
  <head>
      
    <title>图书列表</title>	
    <style type="text/css">
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }
        
        table thead tr th {
            border: 1px solid black;
            padding: 3px;
            background-color: #cccccc;
        }
        
        table tbody tr td {
            border: 1px solid black;
            padding: 3px;
        }
    </style>
    
  </head>
  
  <body>
  <div  align="center">
   <h2>图书列表</h2>
    <s:form action="bookDeletes" theme="simple">
        <table cellspacing="0">
            <thead>
                <tr>
                    <th>Select</th>
                    <th>ISBN</th>
                    <th>Title</th>
                    <th>Price</th>
                    <th>Operation</th>
                </tr>
            </thead>
            <tbody> 
              <s:iterator value="booksList">
                 <tr>
                   <td>
	                   <input type="checkbox" name="bookIds" 
	                   value='<s:property value="bookId"/>'>
                   </td>
                   <td>
                       <s:property value="isbn"/>
                   </td>
                   <td>
                       <s:property value="title"/>
                   </td>
                   <td>
                       <s:property value="price"/>
                   </td>
                   <td>
                       <a href='<s:url action="bookLoad"><s:param name="bookId" value="bookId"/></s:url>'>Edit</a>
                       <a href='<s:url action="bookDelete"><s:param name="bookId" value="bookId"/></s:url>'>Delet</a>
                   </td>
                 </tr>              
              </s:iterator>   
            </tbody>
        </table>        
        <s:submit value="RemoveAll" />          
        <a href="/15Struts2-11-interceptor/curp/BookAdd.jsp">Add</a> 
         <a href='<s:url action="page"><s:param name="pageNow" value="1"/></s:url>'>首    页</a>
         <a href='<s:url action="page"><s:param name="pageNow" value="pageNow-1"/></s:url>'>上一页</a>
         <a href='<s:url action="page"><s:param name="pageNow" value="pageNow+1"/></s:url>'>下一页</a>
         <a href='<s:url action="page"><s:param name="pageNow" value="pageCount"/></s:url>'>末    页</a>
    </s:form>    
  </div>
  </body>
</html>