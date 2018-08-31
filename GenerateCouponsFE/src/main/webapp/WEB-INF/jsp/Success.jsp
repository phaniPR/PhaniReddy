<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
* {
	box-sizing: border-box;
}

/* Style the body */
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

/* Header/logo Title */
.header {
	padding: 20px;
	text-align: center;
	background: lightblue;
	color: white;
}

/* Increase the font size of the heading */
.header h1 {
	font-size: 40px;
}

/* Style the top navigation bar */
.navbar {
	overflow: hidden;
	background-color: #333;
}

/* Style the navigation bar links */
.navbar a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

/* Main column */
.main {
	-ms-flex: 70%; /* IE10 */
	flex: 70%;
	background-color: white;
	padding: 20px;
}

/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
	.row {
		flex-direction: column;
	}
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
	.navbar a {
		float: none;
		width: 100%;
	}
}
</style>
</head>

<body>

	<div class="header">
		<div class="col-sm-1">
			<a href="https://www.capgemini.com/"> <img src="..\img\capg.jpg"
				class=img-thumbnail height="45" width="65" />
			</a>
		</div>

		<h1>CapStore</h1>
	</div>

	<div class="navbar"></div>
	<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>The Coupon has been sent successfully!</h2>
	</center><br><br>
	<center><font color="blue">Now, the customer can use this coupon on his
	next purchase!!</font></center>
</body>
</html>