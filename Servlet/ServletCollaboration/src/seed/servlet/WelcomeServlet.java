package seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name= request.getParameter("txtname");
		
		  PrintWriter out=response.getWriter();
		 
		  out.write(name+" ------>  Welcome to second servlet ");
		  
		  out.println("<html>");
		  out.println("<body bgcolor='pink'><br><br><br><br>");
		  out.println("<br>****** Hello   <I>" +name +  "</I>");
		  out.println("<br><br><br><br> Welcome to Application <br>");
		  out.println("<a href='./LogoutServlet' align='right'>LOGOUT</a>");
		  	
		  out.println("</body>");
		  out.println("</html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}