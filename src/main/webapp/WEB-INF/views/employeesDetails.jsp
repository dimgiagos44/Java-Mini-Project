<%@page import="net.javaguides.springboot.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<%List<Employee> listEmployees =  (List<Employee>)request.getAttribute("listEmployees"); %>
</body>
<div align="center" class="container my-2">
	<h1>Employee Details</h1>
	<table border="1" class = "table table-stripped table-responsive-md">
		<thead>
			<tr>
				<th> Employee Id</th>
				<th> First Name</th>
				<th> Last Name</th>
				<th> Job</th>
				<th> Manager Id</th>
				<th> Hire Date</th>
				<th> Salary</th>
				<th> Comm</th>
				<th> Department Id</th>
			</tr>
		</thead>
		<tbody>
			<%for(Employee employee : listEmployees){ %>
			<tr>
				<td><%=employee.getEmpId()%></td>
				<td><%=employee.getFirstName()%></td>
				<td><%=employee.getLastName()%></td>
				<td><%=employee.getJob()%></td>
				<td><%=employee.getMngId()%></td>
				<td><%=employee.getHireDate()%></td>
				<td><%=employee.getSalary()%></td>
				<td><%=employee.getComm()%></td>
				<td><%=employee.getDepId()%></td>
				<a href="/departments/<%=employee.getDepId()%>">
                	<button type="submit" class="btn btn-danger">Back</button>
                </a>
			</tr>
			<%} %>
			
		</tbody>
	</table>
</div>
</html>