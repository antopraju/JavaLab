/*
Create two tables Flight(Flight_Number, Airline_Name, Weekdays) and SeatReservation(Flight_Number, Date, Seat_Number, Customer_Name, Customer_Phone) in MySQL database.
b. Create JSP page ReserveOnline.jsp to reserve an airline seat and insert the values into the table SeatReservation. OnClick of Submit in ViewDetails.jsp display information about reservation. Validate the Flight_Number from already existing Flight database and generate random number for Seat_Number within the range 1-500.
c. Also create a link to display information of all the flights running on a particular day.
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Reserve
 */
@WebServlet("/Reserve")
public class Reserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String flight = request.getParameter("flight");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String phone = request.getParameter("phone");
		int seat = (int)(Math.random() * 500);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javanew1","root","anto");
			Statement st = con.createStatement();
			st.executeUpdate("insert into SeatReservation (flightno, date, seat, name, phone) values ('" + flight + "','" + date + "'," + seat + ",'" + name +"','"+phone+"')");
			response.sendRedirect("ViewDetails.jsp?flight="+flight+"&name="+name+"&phone="+phone+"&seat="+seat+"&date="+date);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
