package seed.jsp;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UserBean ub = new UserBean();
		
		ub.setUsername(request.getParameter("username"));
		ub.setPass(request.getParameter("pass"));
		
        PrintWriter out = response.getWriter();
		
		boolean ret = ub.validateUser();
		if (ret == true) {
		
			out.print("Hello"+request.getParameter("username"));
			RequestDispatcher rd=request.getRequestDispatcher("Catalog.jsp");
			rd.forward(request, response);
		
		} else {
			RequestDispatcher rd=request.getRequestDispatcher("Invalid.jsp");
			rd.include(request, response);
		}	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
