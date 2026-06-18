<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
<h1>Welcome to Spring MVC Applicationn</h1>

<%

String s= (String)request.getAttribute("Name");

Integer i=(Integer)request.getAttribute("Id");
out.println("Id :"+i+"Name"+s);

%>


</body>
</html>