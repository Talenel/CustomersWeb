

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		String id= request.getParameter("id");
		String nextURL;
		
		if(!id.equals("New"))
		{
			try
			{
				nextURL = "/output2.jsp";
				
				Customer cust=new Customer(Integer.parseInt(id));
				session.setAttribute("cust", cust);
	
				String message=cust.displayCustomer();
				
				
				//request.setAttribute("id", id);
				request.setAttribute("message", message);
			}
			catch(NumberFormatException e)
			{
				nextURL ="/output.jsp";
				String message= (String) session.getAttribute("message");
				request.setAttribute("message", message);
				
				String error="That id value is an invalid input.  Please try again";
				request.setAttribute("error", error);
				
			}
		}
		else
		{
			nextURL = "/add.jsp";
			String error="";
			request.setAttribute("error", error);
			
		}
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}
	
	

}
