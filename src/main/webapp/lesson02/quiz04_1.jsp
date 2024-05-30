<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<%
		// request params
		int cm = Integer.valueOf(request.getParameter("length"));
		String[] changeArr = request.getParameterValues("change");

		// 길이 변환
		double inch = 0.0;
		double yard = 0.0;
		double feet = 0.0;
		double meter = 0.0;
		if (changeArr != null) {
			for (String change : changeArr) {
				if (change.equals("inch")) {
					inch = cm * 0.393701; 
				}		
				if (change.equals("yard")) {
					yard = cm * 0.010936; 
				}
				if (change.equals("feet")) {
					feet = cm * 0.032808; 
				}
				if (change.equals("meter")) {
					meter = cm * 0.01; 
				}
			}
		}
	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h2><%= cm %>cm</h2>
		<hr>
		<h2><%= inch %>in</h2>
		<h2><%= yard %>yd</h2>
		<h2><%= feet %>ft</h2>
		<h2><%= meter %>m</h2>
	</div>
</body>
</html>