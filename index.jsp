<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Data of prime minister</h4>
	<div>
		<form action="Pm" method="Post">
			<div>
				Name<input type="text" name="Name" />
			    Country<input type="text"name="Country" /><br>
			</div>
			<div>
				<bold>Marriage</bold>
				  <input type="radio" id="html" name="Marriage" value="HTML">
				  <label for="html">Unmarried</label><br>   <input type="radio"
					id="css" name="Marriage" value="CSS">   <label
					for="css">Married</label><br>
			</div>
			<div>
			   <bold>Party</bold>
				<select name="Party" id="cars">
					<option value="volvo">Bjp</option>
					<option value="saab">Sp</option>
					<option value="mercedes">Congress</option>
					<option value="audi">Bsp</option>
				</select>
				<br>
			</div>
			<div>
			<bold>Age</bold>
			<input type="text" name="Age">
			</div>
			<div>
				<bold>Gender</bold>
				  <input type="radio" id="html" name="Gender" value="HTML">
				  <label for="html">Male</label><br>
				   <input type="radio"
					id="css" name="Gender" value="CSS">   <label
					for="css">Female</label><br>
					  <input type="radio"
					id="css" name="Gender" value="CSS">   <label
					for="css">Others</label><br>
			</div>
			<div>
			<bold>Period As</bold>
			  <input type="text" id="html" name="Period" value="HTML">		
					
			</div>
			<div>
			  <p> <bold>Times Repersent</bold></p>
				<select name="Repersent" id="cars">
					<option value="volvo">2000</option>
					<option value="saab">2005</option>
					<option value="mercedes">2015</option>
					<option value="audi">2020</option>
				</select>
			</div>
			<input type="submit" value = "click"/>
		</form>
	</div>
</body>
</html>