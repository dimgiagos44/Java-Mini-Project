<%@page import="net.javaguides.springboot.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<%List<Employee> listEmployees =  (List<Employee>)request.getAttribute("listEmployees"); %>
</body>
<div align="center" class="container my-2">
	<h1>Employees List</h1>
	<table border="1" class = "table table-stripped table-responsive-md">
		<thead>
			<tr>
				<th> Employee Id</th>
				<th> First Name</th>
				<th> Last Name</th>
			</tr>
		</thead>
		<tbody>
			<%for(Employee employee : listEmployees){ %>
			<tr>
				<td style="width: 70px"><%=employee.getEmpId()%></td>
				<td style="height: 50px"><%=employee.getFirstName()%></td>
				<td><%=employee.getLastName()%></td>
				<td style="width: 100px">
						<a href="/employees/<%=employee.getEmpId()%>">
                			<button type="submit" class="btn btn-primary">Proceed</button>
                		</a>
				</td>
			</tr>
			<%} %>
			<a href="/departments/">
                	<button type="submit" class="btn btn-danger">Back</button>
                </a>
		</tbody>
	</table>
</div>
</html>