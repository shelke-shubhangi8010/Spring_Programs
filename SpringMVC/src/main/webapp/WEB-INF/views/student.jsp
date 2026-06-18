<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Studdent List</h1>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
		</tr>


		<c:forEach var="student" items="${studentlist} ">
			<td>ID: ${student.id}</td>

			<td>Name : $ {student.name}<br></td>

			<td>Age : ${student.age}</td>
		</c:forEach>
	</table>
</body>
</html>