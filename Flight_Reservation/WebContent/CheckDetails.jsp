<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Checking Flight Availability</title>
</head>
<body>
		<h3>FLIGHTS AVAILABLE ON A PARTICULAR DAY</h3>
		<%
		String day = request.getParameter("day");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanew1","root","anto");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from flight where weekdays like '%"+ day + "%'");
		out.print("<table>");
		out.print("<th>FlightNo</th><th>AirlineName</th><th>WeekDays</th>");
		
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>"+ rs.getString(1) + "<td>");
			out.print("<td>"+ rs.getString(2) + "<td>");
			out.print("<td>"+ rs.getString(3) + "<td>");
			out.print("</tr>");
		}
		out.print("<table/>");
		%>
</body>
</html>