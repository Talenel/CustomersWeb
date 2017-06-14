

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String nextURL = "/output.jsp";
		String last = request.getParameter("lastname");
		ArrayList<ArrayList<String>> table=Customer.displayCustomers(last);
		
		String message=makeString(table);
		session.setAttribute("message", message);
		String error="";
		
		request.setAttribute("error", error);
		request.setAttribute("message", message);
		
		getServletContext().getRequestDispatcher(nextURL).forward(request,response);
	}
	
	
	private String makeString(ArrayList<ArrayList<String>> table)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("<table>");
		for(int i=0;i<table.size();i++)
		{
			sb.append("<tr>");
			for(int j=0;j<table.get(0).size();j++)
			{
				sb.append("<td>"+table.get(i).get(j)+"</td>");
			}
			sb.append("</tr>");
			
		}
		sb.append("</table>");
		
		return sb.toString();
	}

}
