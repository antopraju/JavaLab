<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ORDERS</title>
</head>
<body>
	<table>
		<tr>
				<th>Order NO</th>
				<th>Accessories</th>
				<th>Tag-Line</th>
				<th>Chest-Pocker</th>
				<th>Color</th>
		</tr>
		
		<%
		
			Class.forName("com.mysql.jdbc.Driver");
		  	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanew","root","anto");
		  	if(con != null){
		  		Statement st = con.createStatement();
		  		ResultSet rs = st.executeQuery("select * from tshirt");
		  		while(rs.next()){
		  			out.println("<tr>");
		  			out.println("<td>" + rs.getInt(1) + "</td>");
		  			out.println("<td>" + rs.getString(2) + "</td>");
		  			out.println("<td>" + rs.getString(3) + "</td>");
		  			out.println("<td>" + rs.getString(4) + "</td>");
		  			out.println("<td>" + rs.getString(5) + "</td>");
		  			out.println("</tr>");
		  		}
		  		
		  	}
		
		
		%>
	
	</table>

</body>
</html>