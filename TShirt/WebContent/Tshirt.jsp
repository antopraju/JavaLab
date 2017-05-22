<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order Your T-shirt Here:</title>
<style>
		h3{
			text-align = center;
		}
</style>
</head>
<body>
		<form action="TShirt" method="get">
		<label>Accessories: Belt <input type="checkbox" name="accessories" value="belt" /></label>
		<label>Cap <input type="checkbox" name="accessories" value="cap" /></label>
		<label>Hair-Band <input type="checkbox" name="accessories" value="hairband" /></label>
		<br/>
		<br/>
		<label>T-Shirt Tag-Line</label><br/>
		<textarea rows="5" cols="25" name="tag"></textarea>
		<br/>
		<br/>
		<label>Chest Pocket: Yes <input type="radio" name="chest" value="yes" /></label>
		<label>No <input type="radio" name="chest" value="no" /></label>
		<br/>
		<br/>
		<select name="color">
			<option value="red">RED</option>
			<option value="green">GREEN</option>
			<option value="blue">BLUE</option>
		</select>
		<br/>
		<br/>
		<input type="submit" value="CLICK ME"/>
		</form>
</body>
</html>