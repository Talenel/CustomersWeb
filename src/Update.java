

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextURL;
		String message;
		String error;
		String street= request.getParameter("street");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String zip= request.getParameter("zip");
		
		HttpSession session = request.getSession();
		Customer cust =(Customer) session.getAttribute("cust");	
		try{
			
			int Zip=Integer.parseInt(zip);
			
					
			nextURL = "/output4.jsp";
			
			cust.setCity(city);
			cust.setState(state);
			cust.setStreet(street);
			cust.setZip(zip);
			cust.editAddress();
			
			message=cust.displayCustomer();
		}
		catch(NumberFormatException e)
		{
			
			nextURL="/output3.jsp";
			error="The zip code is an invalid value";
			message=cust.displayCustomer();
			request.setAttribute("error", error);
		}
		
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
