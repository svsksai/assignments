<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student score</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center bg-success p-2 m-2">Trainee Score</h1>
<div class="text-right p-2 m-2"><a class="btn btn-danger" href="home.htm">Home</a></div>
<hr/>
<table class="col-md-4 table table-light table-striped table-hover mx-auto">

<tr>
<td>Student Name</td>
<td>${smodel.stuName}</td>
</tr>
<tr>
<td>Java</td>
<td>${smodel.javaMarks}</td>
</tr>
<tr>
<td>Angular</td>
<td>${smodel.angMarks}</td>
</tr>
<tr>
<td>Spring</td>
<td>${smodel.springMarks}</td>
</tr>
<tr>
<td>Date Of Joining</td>
<td>${smodel.doj}</td>
</tr>
<tr>
<td>Total Marks</td>
<td>${total}</td>
</tr>
<tr>
<td>Average</td>
<td>${average}</td>
</tr>
<tr>
<td>Result</td>
<td>${result}</td>
</tr>
</table>
</body>
</html>