package seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CatlogServlet
 */
public class CatlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatlogServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
        String unm = request.getParameter("username");
		
		HttpSession session = request.getSession();
		session.setAttribute("usernm", unm);
	
		PrintWriter out = response.getWriter();
		
		out.print("<br>Welcome, "+unm+"<br>");
		out.print("<link rel='stylesheet' href='style.css'>");
		out.print("<form action=DisplayServlet method='POST'>");
		out.print("Enter Product Code:<input type='text' name='pcode'><br>");
		
		out.print("<input type='submit' value='DisplayDetails'><br>");
		out.print("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}