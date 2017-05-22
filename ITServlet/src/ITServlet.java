/*
8. Create a Servlet to file IT returns that accepts personal information, salary information and Tax deduction details from the user and write the information into a file. Also accept the name of the person and display in on the page.

*/

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ITServlet
 */
@WebServlet("/ITServlet")
public class ITServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ITServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		double salary = Double.parseDouble(request.getParameter("salary"));
		double tax = Double.parseDouble(request.getParameter("tax"));
		double incometax = salary * 20 / 100;
		incometax = incometax - (incometax * tax / 100);
		
		response.getWriter().append("Name: "+name).append("\nGender: "+gender).append("\nSalary: "+salary).append("\nTax Deduction: "+tax).append("\nIncome Tax: "+incometax);
		String filename = new File("data.txt").getAbsolutePath();
		PrintWriter c = new PrintWriter("data.txt");
		c.println(name);
		c.println(gender);
		c.println(salary);
		c.println(tax);
		c.println(incometax);
		System.out.println("The output is written to file at: "+filename);
		c.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
