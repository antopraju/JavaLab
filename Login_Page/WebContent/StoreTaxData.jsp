<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
		String user = (String) session.getAttribute("user");
		if(user == null)
			response.sendRedirect("index.jsp");
		Date date = new Date();
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tax Calculator</title>
</head>
<body>
		<h3>WELCOME: <%=user %></h3>
		<h2>DATE: <%=date.toString() %></h2>
		
		<h1>TAX CALCULATION</h1>
		<form action="CalculateTax.jsp">
		<label>NAME: </label>
		<input type="text" name="name"/>
		<br/>
		
		<label>ORGANIZTION</label>
		<select name="org">
			<option value="google">GOOGLE</option>
			<option value="apple">APPLE</option>	
		</select>
		<br/>
		
		<label>GENDER: </label>
		<input type="radio" name="gender" value="male"/>MALE
		<input type="radio" name="gender" value="female" /> FEMALE
		<br/>
		
		<label>INCOME: </label>
		<input type="number" name="income"/>
		<br/>
		
		<input type="submit" value="SUBMIT"/>
		</form>
		
<%
		if((String)session.getAttribute("name") != null){
			String name = (String)session.getAttribute("name");
			String gender = (String)session.getAttribute("gender");
			String org = (String)session.getAttribute("org");
			double income = (double)session.getAttribute("income");
			double percent = (double)session.getAttribute("percent");
			double incometax = (double)session.getAttribute("incometax"); %>
			
			<p>
			Name: <%=name %><br/>
			Gender: <%=gender %><br/>
			Organization: <%=org %><br/>
			Income: <%=income %><br/>
			Percent: <%=percent%><br/>
			IncomeTax: <%=incometax %>	<br/>		
			</p>
			
		<% }%>

		<a href="index.jsp?status=2">LOGOUT</a>
</body>
</html>