<%@page import="net.javaguides.springboot.model.Department"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Departments list</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<%List<Department> listDepartments =  (List<Department>)request.getAttribute("listDepartments"); %>
</body>
<div align="center" class="container my-2">
	<h1>Departments List</h1>
	<table border="1" class = "table table-stripped table-responsive-md">
		<thead>
			<tr>
				<th> Department Id</th>
				<th> Name</th>
				<th> Location Id</th>
			</tr>
		</thead>
		<tbody>
			<%for(Department department : listDepartments){ %>
			<tr>
				<td><%=department.getDepId()%></td>
				<td><%=department.getDepName()%></td>
				<td><%=department.getLocId()%></td>
				<td style="width: 100px">
					<a href="/departments/<%=department.getDepId()%>">
                		<button type="submit" class="btn btn-primary">Proceed</button>
                	</a>
				</td>
			</tr>
			<%} %>
				<a href="/locations/">
                	<button type="submit" class="btn btn-danger">Back</button>
                </a>
		</tbody>
	</table>
</div>
</html>