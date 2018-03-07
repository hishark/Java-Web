<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body><html>
<head>

<title>图书列表</title>
<style type="text/css">
/*  table {
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
}  */
#tab {
	border: 1px solid black;
	padding: 3px;
}
</style>

</head>

<body>
	<div align="center">
		<h2>图书列表</h2>
		<s:form theme="simple">
			<table cellspacing="0" id="tab">
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
							<td><input type="checkbox" name="bookId"
								value='<s:property value="bookId"/>'></td>
							<td><s:property value="isbn" /></td>
							<td><s:property value="title" /></td>
							<td><s:property value="price" /></td>
							<td><a href="">Edit</a> <a href="">Delet</a></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<s:submit value="RemoveAll" />

			<a href="/15Struts2-09-curd/curd/BookAdd.jsp">Add</a>
		</s:form>


		<s:form action="bookList" method="post" id="load">

			<s:submit value="Load"></s:submit>

		</s:form>
	</div>




</body>


</html>

</body>
</html>