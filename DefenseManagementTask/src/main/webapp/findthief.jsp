<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>FindTheif</title>
</head>
<body bgcolor="black">
	<div align="center">
		<img src="./images/thief.jpg" width="90" height="90">
		<h1>
			<font color="red">Thief Details</font>
		</h1>
		<form method="post" action="ThiefDetails">
			<b><font color="white">Enter the name:</font></b><input type="text" name="thiefname"><br> 
			<b><font color="white">Enter the id:</font></b><input type="search" name="idno">
			<input type="submit" value="Search"><br><br><br>
			<b><font color=red>Protective Tips</font></b><a href=blog.jsp>Click Here</a>
		</form>
	</div>
</body>
</html>