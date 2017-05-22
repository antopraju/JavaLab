<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TAX CALCULATION</title>
</head>
<body>
		<%
			String name = request.getParameter("name");
			String org = request.getParameter("org");
			String gender = request.getParameter("gender");
			double income = Double.parseDouble(request.getParameter("income"));
			double percent = 0.0;
			double incometax = 0.0;
			if(income > 500000 && income < 10000)
				percent = 15.0;
			if(income > 500000)
				percent = 20.0;
			incometax = income * percent / 100;
			
			session.setAttribute("name",name);
			session.setAttribute("org",org);
			session.setAttribute("gender",gender);
			session.setAttribute("income",income);
			session.setAttribute("percent",percent);
			session.setAttribute("incometax",incometax);
			response.sendRedirect("StoreTaxData.jsp");
		
		%>
</body>
</html>