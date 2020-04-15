<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Account Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
<body>
<h1 align="center">TransferFund</h1>
<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<h2 class="text-center">View All Accounts</h2>

	<table class ="col-md-8 table table-striped mx-auto">
		<tr>
			<td>Account ID</td>
			<td>Customer Name</td>
			<td>Balance</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${alist}" var="a">
		 <tr>
			<td>${a.accId}</td>
			<td>${a.custName}</td>
			<td>${a.balance}</td>
			<td><a class="btn btn-primary" href="delete?txtaid=${a.accId}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>