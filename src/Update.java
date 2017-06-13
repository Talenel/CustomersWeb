

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String nextURL = "/output4.jsp";
		String street= request.getParameter("street");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		String zip= request.getParameter("zip");
		String id= request.getParameter("id");
		
		Customer cust=new Customer(Integer.parseInt(id));
		cust.setCity(city);
		cust.setState(state);
		cust.setStreet(street);
		cust.setZip(zip);
		cust.editAddress();
		
		String message=cust.displayCustomer();
		
		
		
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}

}
