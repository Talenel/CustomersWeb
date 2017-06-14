

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextURL;
		String street= request.getParameter("street");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String zip= request.getParameter("zip");
		String first= request.getParameter("first");
		String last= request.getParameter("last");
		String email= request.getParameter("email");
		String title= request.getParameter("title");
		String position= request.getParameter("position");
		String company= request.getParameter("company");
		try
		{
		
			int Zip=Integer.parseInt(zip);
			nextURL = "/output5.jsp";
			Customer cust=new Customer(title,first,last,street,city,state,zip,email,position,company);
			String message=cust.displayCustomer();
			
			
			request.setAttribute("message", message);
		}
		catch(NumberFormatException e)
		{
			nextURL ="/add.html";
			String error="The value for Zip Code is not a valid value. Please try again";
			request.setAttribute("error", error);
			
		}
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
