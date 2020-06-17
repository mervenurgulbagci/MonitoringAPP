<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SERVICE 2 </title>
</head>
<body>

<h1> SERVICE 2 </h1>

<p>
Hello World! Time is <%= new java.util.Date() %>
</p>

<p>
We are running on  <%= application.getServerInfo() %>!!!
</p>
</body>
</html>
