/*
Create a Telephone Directory Application using Servlet that searches the database based on phone number or name. Also show database table creation with inserting 5 values to the table.
Database Name: OnlineDirectory
Table Design:
Table Name: Telephone_Directory
Attributes: Phone_Number, Name, Address, Company, Pin_Code.
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Telephone
 */
@WebServlet("/Telephone")
public class Telephone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Telephone() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
					PrintWriter out = response.getWriter();
					out.println("<html>\n");
					out.println("<head><title>Telephone Directory Application</title></head>\n");
					out.println("<body>");
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanew","root","anto");
						Statement st = con.createStatement();
						String search = request.getParameter("search");
						String search_string = request.getParameter("search_string");
						
						out.println("<table>\n");
						out.println("<tr>");
						out.println("<th>PhoneNumber</th><th>Name</th><th>Address</th><th>Company</th><th>Pin_Code</th>");
						out.println("</tr>");
						
						if(search.equals("phone")){
							ResultSet rs = st.executeQuery("select * from Telephone_Directory where phoneno like '%"+ search_string + "%'");
							while(rs.next()){
								out.println("<tr>");
								out.println("<td>"+ rs.getInt(1) + "</td>");
								out.println("<td>"+ rs.getString(2) + "</td>");
								out.println("<td>"+ rs.getString(3) + "</td>");
								out.println("<td>"+ rs.getString(4) + "</td>");
								out.println("<td>"+ rs.getString(5) + "</td>");
								out.println("</tr>");
							}	
						}
						else if(search.equals("name")){
							ResultSet rs = st.executeQuery("select * from Telephone_Directory where name like '%"+ search_string + "%'");
							while(rs.next()){
								out.println("<tr>");
								out.println("<td>"+ rs.getInt(1) + "</td>");
								out.println("<td>"+ rs.getString(2) + "</td>");
								out.println("<td>"+ rs.getString(3) + "</td>");
								out.println("<td>"+ rs.getString(4) + "</td>");
								out.println("<td>"+ rs.getString(5) + "</td>");
								out.println("</tr>");
						}
						}else{
							out.println("<h1>Something went Wrong</h1>");
						}
						out.println("</table>");
					
					}catch(ClassNotFoundException e){
						e.printStackTrace();
					}catch(SQLException e){
						e.printStackTrace();
					}	
					out.println("</body>");
					out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
