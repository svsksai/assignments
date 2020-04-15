<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<h1 class="text-center bg-success p-2 m-2">Trainee Score</h1>
<div class="text-right p-2 m-2"><a class="btn btn-danger" href="home.htm">Home</a></div>

<sf:form action="stusubmit.htm" modelAttribute="smodel" method="post">
<table class=" col-md-8 table table-light table-striped  mx-auto">
<tr>
<td>Student Name</td>
<td><sf:input path="stuName"  /></td>
<td><sf:errors path="stuName" class="text-danger" /></td>
</tr>
<tr>
<td>Java Marks</td>
<td><sf:input path="javaMarks"  /></td>
<td><sf:errors path="javaMarks" class="text-danger" /></td>
</tr>
<tr>
<td>Angular Marks</td>
<td><sf:input path="angMarks"  /></td>
<td><sf:errors path="angMarks" class="text-danger" /></td>
</tr>
<tr>
<td>Spring Marks</td>
<td><sf:input path="springMarks"  /></td>
<td><sf:errors path="springMarks" class="text-danger" /></td>
</tr>
<tr>
<tr>
<td>Date Of Joining</td>
<td><sf:input path="doj" placeholder="yyyy-M-d" type="date" /></td>
<td><sf:errors path="doj" class="text-danger" /></td>
</tr>
<tr>
<td colspan="3" align="center"><input type="submit" /></td></tr>

</table>
</sf:form>
</body>
</html>