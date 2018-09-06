<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>

<link rel='stylesheet' href='/resources/css/bootstrap.min.css'>

<title>Grade List</title>
</head>

<body>

<div class='well'>
<h1>Grade List</h1>
<br/><br/>
<table  class='table'>
	<tr>
		<th>First name</th>
		<th>Last name</th>
		<th>Grade</th>
	</tr>
	<c:if test='${not empty grades}'>
		<c:forEach var='grade' items='${grades}'>
			<tr><td>${grade.firstName}</td><td>${grade.lastName}</td><td>${grade.grade}</td></tr>
		</c:forEach>
	</c:if>
</table>

<br/><br/>
<a href='/'>Grade a student</a>
</div>

</body>
</html>