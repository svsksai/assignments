<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMIform</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center bg-success p-2 m-2">EMI Calculation</h1>
<div class="text-right p-2 m-2"><a class="btn btn-danger" href="home.htm">Home</a></div>
<form action="calcemi.htm">
<table class=" col-md-4 table table-light table-striped  mx-auto">
<tr>
<td>Customer Name</td>
<td><input type="text" name="txtname" required />
</tr>
<tr>
<td>Loan Amount</td>
<td><input type="number" name="txtamt" required />
</tr>
<tr>
<td>Years</td>
<td><input type="number" name="txtyears" required min="5" max="25"/>
</tr>
<tr>
<td colspan="3" align="center"><input type="submit" value="Calc EMI" /></td></tr>

</table>
</form>
</body>
</html>