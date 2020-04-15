<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMIcalculation</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center bg-success p-2 m-2">EMI Calculation</h1>
<div class="text-right p-2 m-2 "><a class="btn btn-danger" href="home.htm">Home</a></div>

<table class="col-md-4 table table-light table-striped table-hover mx-auto">

<tr>
<td>Customer Name</td>
<td>${param.txtname}</td>
</tr>
<tr>
<td>Loan Amount</td>
<td>${param.txtamt}</td>
</tr>
<tr>
<td>Years</td>
<td>${param.txtyears}</td>
</tr>
<tr>
<td>Total Amount</td>
<td>${Totalamt}</td>
</tr>
<tr>
<td>Monthly EMI</td>
<td>${monthlyamt}</td>
</tr>


</body>
</html>