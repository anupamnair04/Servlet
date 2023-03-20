package seed.track;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
        Cookie cArr [] = request.getCookies();//returns two Cookie objects 
		
			/*for(int i=0;i<cArr.length;i++)
			{
				String str = cArr[i].getValue();
			}*/
			
			String sessionId = cArr[0].getValue();//S23293293394
			String username =  cArr[1].getValue();//Rahul
			
			PrintWriter out = response.getWriter();
			
			out.println("<body bgcolor=cyan><p>Dear " + sessionId + " Welcome to Product Page</p>");
			out.println("<p>Your session id is " + username + "</p></body>");
			out.println("<br><p align=right><a href='Login.html'>Log Out</p></body>");
			
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}