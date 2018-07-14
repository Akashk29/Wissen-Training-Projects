<!DOCTYPE html>
<%@page import="com.shop.model.Product"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PM</title>
<link href="css/bootstrap.css" rel="stylesheet" />
</head>
<body class="container">
	<hr />
	<h1>PM</h1>
	<hr />
	
	<div class="col-sm-8 col-md-8">
		<div class="card">
			<div class="card-header">Product Form</div>
			<div class="card-body">
				<form action="update" method="post">
				<div class="row">
					<div class="col">
						<input type="text" name="id" value="${product.id}" readonly="readonly"
						       class="form-control" 
						       placeholder="name">
					</div>
					</div>	
					<hr/>
					<div class="row">
						<div class="col">
							<input type="text" name="name" value="${product.name}"
							       class="form-control" 
							       placeholder="name">
						</div>
						<div class="col">
							<input type="number" name="price" value="${product.price}" 
							       class="form-control" 
							       placeholder="price">
						</div>
						<div class="col">
							<input type="date" name="date" value="${product.date}"
							       class="form-control" 
							       placeholder="make-date">
						</div>
					</div>
					<hr />
					<div class="row">
						<div class="col">
							<textarea class="form-control" name="description"
							          placeholder="description">
							          ${product.description}
							</textarea>
						</div>
					</div>
					<hr />
					<button class="btn btn-primary">save</button>
				</form>
			</div>
		</div>
	</div>
	<hr/>
	

</body>
</html>