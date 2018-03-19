<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Book List</title>
</head>
<body><html>
<head>

<title>Book List</title>
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
	<div align="center">
		<h2>Book List</h2>
		<s:form theme="simple" action="bookDeletes">
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
							<!-- 用户选中的bookId全部放入bookIds -->
							<td><input type="checkbox" name="bookIds"
								value='<s:property value="bookId"/>'></td>
							<td><s:property value="isbn" /></td>
							<td><s:property value="title" /></td>
							<td><s:property value="price" /></td>
							 
							<td>
							<a href='<s:url action="bookLoad"><s:param name="bookId" value="bookId"/></s:url>'>Edit</a> 
							
							<a href='<s:url action="bookDelete"><s:param name="bookId" value="bookId"/></s:url>'>Delete</a>
							 
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			 <br>
			<s:submit value="RemoveAll" />
			<br>  

							
			
		</s:form>


		<s:form action="bookList"  id="load">

			<s:submit value="Load"></s:submit>

		</s:form>
		
		  
		<a href="/15Struts2-11-Interceptor/curd/BookAdd.jsp">Add</a>
		<!-- pageNow是一个变量 是Action中用getset方法设置的那个变量 -->
		<a href='<s:url action="page"><s:param name="pageNow" value="1"/></s:url>'>Begin</a> 
		<a href='<s:url action="page"><s:param name="pageNow" value="pageNow-1"/></s:url>'>Last Page</a> 
		<a href='<s:url action="page"><s:param name="pageNow" value="pageNow+1"/></s:url>'>Next Page</a> 
		<a href='<s:url action="page"><s:param name="pageNow" value="pageCount"/></s:url>'>End</a> 
			
	</div>




</body>


</html>

</body>
</html>