<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FLIGHT RESERVATION SYSTEM</title>	
</head>
<body>
		<form method="get" action="Reserve">
		<h2>FLIGHT RESERVATION AND BOOKING</h2>
		<br/>
		<select name="flight">
		<%
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanew1","root","anto");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from flight");
			while(rs.next()){
				out.print("<option name='"+ rs.getString(1) + "'>"+ rs.getString(1) +"</option>");
			}
		%>
		 </select>
		  <br/>
		  <br/>
		  <label>Name:</label>
		  <input type="text" name="name"/><br/>
		  
		  <label>Date: </label>
		  <input type="text" name="date"/><br/>
		  
		  <label>Phone: </label>
		  <input type="text" name="phone"/><br/>
		
		  <input type="submit" value="BOOK"/>
		  </form>
		  
		  <hr>
		  
		  <form action="CheckDetails.jsp" method="get">
		  <h3>Check Flights on a particular day..</h3>
		  <select name="day">
		  <option value="M______">MONDAY</option>
		  <option value="_T_____">TUESDAY</option>
		  <option value="__W____">WEDNESDAY</option>
		  <option value="___T___">THURSDAY</option>
		  <option value="____F__">FRIDAY</option>
		  <option value="_____S_">SATURDAY</option>
		  <option value="______S">SUNDAY</option>
		  </select>
		  <input type="submit" value="CHECK"/>
		  </form>

</body>
</html>