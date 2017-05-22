<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
			String i = request.getParameter("id");
		 	if(i != null){
		 		if(i.equals("1")){
		 			out.println("<h3>Your Order is placed!!! Thank You....<h3>");
		 		}
		 		else if(i.equals("2")){
		 			out.println("<h3>Your was not places!!! Try again...<h3>");
		 		}
		 	}
		 	else{
		 		out.println("<h3>Something went wrong, Your order was not successfull..,<h3>");
		 	}
		%>
		<br/>
		<p> View all the orders: <a href="Display.jsp">here</a></p>

</body>
</html>