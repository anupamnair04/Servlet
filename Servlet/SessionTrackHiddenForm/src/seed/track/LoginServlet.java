package seed.track;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		PrintWriter out=response.getWriter();
		
  		String u1=request.getParameter("uname");
  		String p1=request.getParameter("upwd");
  		
  		if(u1.equals("Joy")&& p1.equals("Joy123")){
  			out.println("***********************Valid User");
  			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
  			rd.forward(request, response);	
  		}
  		else{
  			out.println("InValid User");
  			RequestDispatcher rd=request.getRequestDispatcher("Hiddendemo.html");
  			rd.include(request, response);
  		} 
	}
}