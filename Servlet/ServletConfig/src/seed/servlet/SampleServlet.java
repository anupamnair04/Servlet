package seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		ServletContext sc = getServletContext();
		String dbdriver = sc.getInitParameter("driver");
		
		ServletContext sc = getServletContext();
		String dburl = sc.getInitParameter("url");*/
			
		String dbdriver = getServletContext().getInitParameter("driver");
		String dburl = getServletContext().getInitParameter("url");
		
		String dbuid = getServletConfig().getInitParameter("dbuser");
		String dbpass = getServletConfig().getInitParameter("dbpwd");
		
		PrintWriter out = response.getWriter();
		
		out.println("Driver"+dbdriver);
		out.println("URL"+dburl);
		out.println("UID"+dbuid);
		out.println("Pass"+dbpass);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
