<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FLIGHT RESERVED</title>
</head>
<body>
	<h2>Welcome: <%out.println(request.getParameter("name")); %></h2>
	<h3>Your Flight is Reserved</h3>
	<b>Flight: <%out.println(request.getParameter("flight")); %></b><br/>
	<b>Phone: <%out.println(request.getParameter("phone")); %></b><br/>
	<b>Date: <%out.println(request.getParameter("date")); %></b><br/>
	<b>Seat: <%out.println(request.getParameter("seat")); %></b><br/>
</body>
</html>