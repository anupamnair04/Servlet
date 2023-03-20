package seed.track;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		String username = request.getParameter("username");//Rahul
		 
		// sid--->key       S23293293394-->value
		Cookie c1 = new Cookie("sid", "S23293293394");
		// uname--->key      Rahul-->value
		Cookie c2 = new Cookie("uname", username);
		response.addCookie(c1);
		response.addCookie(c2);
		
		
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor=cyan><p>Dear " + username + " Welcome to Online Shopping</p>");
		out.println("<p><a href='ProductServlet'>View Products</a></p></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}