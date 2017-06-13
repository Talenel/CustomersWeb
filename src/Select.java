

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Select() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextURL = "/output2.jsp";
		String id= request.getParameter("id");
		Customer cust=new Customer(Integer.parseInt(id));
		String message=cust.displayCustomer();
		
		
		
		request.setAttribute("message", message);
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}
	
	

}
