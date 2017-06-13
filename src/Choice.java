

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Choice
 */
@WebServlet("/Choice")
public class Choice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Choice() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String choice= request.getParameter("choice");
		String id=request.getParameter("id");
		String cust=request.getParameter("cust");
		if(choice.equals("2"))
		{
			String nextURL = "/output3.jsp";
		
		
			
			String message="hi";
			
			
			request.setAttribute("cust", cust);
			
			request.setAttribute("id", id);
			request.setAttribute("message", message);
			
			getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		}
		else
		{
			String nextURL = "/search.html";
			getServletContext().getRequestDispatcher(nextURL).forward(request,response);
		}
	}

}
