<%@page import="net.javaguides.springboot.model.Location"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations list</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<%List<Location> listLocations =  (List<Location>)request.getAttribute("listLocations"); %>
</body>
<div align="center" class="container my-2">
	<h1>Location List</h1>
	<table border="1" class = class = "table table-striped table-responsive-md">
		<thead>
			<tr>
				<th> Location Id</th>
				<th> Name</th>
			</tr>
		</thead>
		<tbody>
			<%for(Location location : listLocations){ %>
				<tr>
					<td><%=location.getLocId()%></td>
					<td><%=location.getLocName()%></td>
					<td style="width: 80px">
						<a href="/locations/<%=location.getLocId()%>">
                			<button type="submit" class="btn btn-primary">Proceed</button>
                		</a>
					</td>
				</tr>
				
			<%} %>
		</tbody>
	</table>
</div>
</html>