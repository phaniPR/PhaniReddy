<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  --%>
     <%-- <%@include file="footer.jsp"%>  --%>
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
	background-color : #ABB2B9;
	/* background-image: linear-gradient(#273746,#A6ACAF); */
	height:100%;
}

/* Header/logo Title */
.header {
	padding: 40px;
	text-align: center;
	background: #FFA07A;
  background-image: linear-gradient(#FFA07A,#444); 
	color: white;
	height:220px;
} 

.knockout {
  background: url(http://apod.nasa.gov/apod/image/0603/coma_misti.jpg) -80px -80px;
  color: red;
  -webkit-text-fill-color: transparent;
  -webkit-background-clip: text;
  font-weight: bold;
  font-size: 100px;         /* 100 */
  font-family: arial, helvetica;
  width: 500px;
  margin: 50px auto;
  text-align: center;
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
	
h6 {
 font-family: "Comic Sans MS", cursive, sans-serif;
}

h3 {
   
   font-family: "Comic Sans MS", cursive, sans-serif;
}
h2 {
  font-family: "Comic Sans MS", cursive, sans-serif;
}
}
</style>
</head>


	<div class="header">
		<div class="col-sm-1">	
		</div>
     <div class="knockout">CapStore</a></div>
	
		</div>
  
	<div class="navbar"></div>


	<title>CAPSTORE Coupon Page</title>
</head>

<body>

	<center>
		<h2>
			 <h2> CAPSTORE Coupon Page </h2> 
		</h2><br><br>
	</center>
	<form>
		<center>
			 Please Enter the customer mailId:  
			<input type="text" id="txt1" required></input><br>
		</center><br>
		<center><input type="button" id="btn" value="Generate Coupon" onclick="location.href='/invite/'+document.getElementById('txt1').value">
		</center><br>
		<center><input type="button" id="btn2" value="Show All" onclick="location.href='/showall'"></center> 
		<br>

			<b><center>
				<h3>	 Customer Id: ${obj.email}   </h3> <br>
				</center></b><br> <b><center>
				<h3>	 Coupon code: ${obj.coupon_id}  </h3>  <br>
				</center></b><br><b><center>
				<h3>  Expiry date: ${obj.date}   </h3> </center></b><br>
				  <br>
		<center><input type="button" id="btn2" value="Send Coupon" onclick="location.href='/Success'"></center> 
		<br></form>
</body>
</html>