<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SalaryCalculated</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center bg-success p-2 m-2">Salary Calculation</h1>
<div class="text-right p-2 m-2"><a class="btn btn-danger" href="home.htm">Home</a></div>

<table class="col-md-4 table table-light table-striped table-hover mx-auto">

<tr>
<td><s:message code="id"/></td>
<td>${employee.eid}</td>
</tr>
<tr>
<td><s:message code="name"/></td>
<td>${employee.ename}</td>
</tr>
<tr>
<td><s:message code="salary"/></td>
<td>${employee.sal}</td>
</tr>
<tr>
<td>PF</td>
<td>${pf}</td>
</tr>
<tr>
<td>Allowances</td>
<td>${allowances}</td>
</tr>
<tr>
<td>Net Salary</td>
<td>${netsal}</td>
</tr>


</table>
</body>
</html>