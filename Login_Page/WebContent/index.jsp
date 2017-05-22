<%
/*
12. Write a program using JSP that helps a student to calculate the income tax on various annual incomes that he will be earning when he gets a job.
Login.html will call dataCapture.jsp that should do the following:
Use Java Collections to make a list of valid users and facilitate user login functionality.
Give a personalized Welcome message and display today’s date.
Have a Text Entry with label ‘Name’ to enter the name of the user.
Give a List of Organizations to choose ‘Place of Work’
Provide a Male or Female option to choose the ‘Gender’
Have a Text Entry with label ‘Annual Income’
Give a Submit button reading ‘Calculate Tax’
CalculateTax.jsp must calculate the interest based on the following business rules: 
Salary below 1,00,000 shall no have income-tax.
Calculate 15% of tax on 1,00,001 – 5,00,000.
Calculate 20% on 5,00,001 onwards.
The final income tax along with the details of how it is calculated must be put in a session object and displayed to the user in dataCapture.jsp. All the income taxes calculated so far by the user, must be taken out of the session object and displayed, each time in dataCapture.jsp which has a link called ‘Logout’ that destroys the session.


*/
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%
	String status = request.getParameter("status");
	HashMap<String, String> user = new HashMap<String, String>();
	user.put("root","anto");
	user.put("admin","admin");
	String username = "";
	if(status != null){
		if(status.equals("2"))
			session.invalidate();
		else{
			username = request.getParameter("username");
			String password = request.getParameter("password");
			if(user.containsKey(username)){
				if(user.get(username).equals(password)){
					session.setAttribute("user",username);
					response.sendRedirect("StoreTaxData.jsp");
				}
			}
		}
	}

%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN PAGE</title>
</head>
<body>
		<form method="get">
		<input type="hidden" name="status" value="1"/>
		
		<div>
		<label>LOGIN PAGE</label>
		</div>
		<hr>
		<div>
		<label>USERNAME: </label>
		<input type="text" name="username" placeholder="anthony"/>
		</div>
		
		<div>
		<label>PASSWORD: </label>
		<input type="password" name="password" placeholder="password"/>
		</div>
		
		<input type="submit" name="LOGIN"/>
		</form>
</body>
</html>
