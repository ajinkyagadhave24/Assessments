<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>Insert title here</title>
</head>
<body>
<h2>In UpdateID</h2>
<form:form action="/update" method="POST" modelAttribute="emp">
Enter ID : <form:input path="employeeid"/><br>
<input type=submit value="Update Employee"></form:form>
</body>
</html>