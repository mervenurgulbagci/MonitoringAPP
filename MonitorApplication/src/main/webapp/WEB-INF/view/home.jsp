<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>MONITOR</title>
</head>
<body>
<% response.addHeader("Refresh","10"); %>
	<h2
		style="background-color: teal; color: white; width: 900px; margin: auto; text-align: center; margin-top: 30px; margin-bottom: 20px; padding: 15px">MONITOR</h2>
	<h4 style="align-items: center; text-align: center;"> Check Time is <%= new java.util.Date() %></h4>
	<table align="center" style="font-size: large; font-weight: 500;">
		<tr bgcolor="silver" style="color: white; ">
			<td colspan="2">Alive Services</td>
		</tr>
		<tr>
			<td width="275px">Name</td>
			<td width="175px">Address</td>
		</tr>
		<c:forEach items="${ups}" var="ups">

			<tr style="background-color: green; color: white;">
				<td>${ups.name}</td>
				<td>${ups.address}</td>
				<td></td>
			</tr>
		</c:forEach>
		<tr style="height: 70px">
			<td> </td>
		</tr>
		
		<tr bgcolor="silver" style="color: white; ">
			<td colspan="2">Dead Services</td>
		</tr>
		<tr>
			<td width="275px">Name</td>
			<td width="175px">Address</td>
		</tr>
		<c:forEach items="${downs}" var="downs">

			<tr style="background-color: red; color: white;">
				<td>${downs.name}</td>
				<td>${downs.address}</td>
				<td></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>