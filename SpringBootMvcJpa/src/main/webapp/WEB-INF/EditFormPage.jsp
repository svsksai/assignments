<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></head>
</head>
<body>
<h1 align="center">Emp Management</h1>
<div class="text-center"><a class="btn btn-danger" href="home">Home</a></div><hr/>
<h2 class="text-center">Edit Employee</h2>

<form action="update" method="post">
<table class="col-md-4 table table-striped mx-auto">
<tr>
			<td>Emp ID</td>
			<td><input type="number" readonly name="empId" value="${emodel.empId}" class="form-control" /></td>
	</tr>
	<tr>
			<td>Emp Name</td>
			<td><input type="text" required name="empName" value="${emodel.empName}" /></td>
    </tr>
    <tr>
			<td>Salary</td>
			<td><input type="number" required name="empSal" value="${emodel.empSal}" /></td>
	</tr>
	<tr>
			<td>Dept</td>
			<td><input type="text" readonly name="dept.deptName" class="form-control" value="${emodel.dept.deptName}" />
			<input type="hidden" name="dept.deptId" value="${emodel.dept.deptId}"/>
	</tr>
	<tr>
			<td>DOJ</td>
			<td><input type="date" required name="doj" value="${emodel.doj}" /></td>
			<input type="hidden" name="txtdept" value="${param.dname}"/>
    </tr>
    <tr>
    <td class="text-center"><input type="submit" value="update"/></td>
    </tr>
</table>
</form>
</body>
</html>