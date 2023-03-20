package seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		String username = (String) session.getAttribute("usernm");
		
        PrintWriter out=response.getWriter();
		
		out.print("Hello,"+username+" This is Display Data Page");
		out.println("<p>Your session id is " + sessionId + "</p></body>");

        try{
        	// retrieve data from request object
        	int pno = Integer.parseInt(request.getParameter("pcode"));
		
		/*
		ServletContext sc = getServletContext();
		String dbdriver = sc.getInitParameter("driver");
		
		ServletContext sc = getServletContext();
		String dburl = sc.getInitParameter("url");*/
			
		String dbdriver = getServletContext().getInitParameter("driver");
		String dburl = getServletContext().getInitParameter("url");
		
		Class.forName(dbdriver);
		
		String dbuid = getServletContext().getInitParameter("dbuser");
		String dbpass = getServletContext().getInitParameter("dbpwd");
		
		//Establish Connection between Java Application & Oracle Data Base
		Connection con = DriverManager.getConnection(dburl,dbuid,dbpass);
		
		System.out.println("Connection Successful");
		
		PreparedStatement pst = con.prepareStatement("select * from product where code = ?");
		pst.setInt(1, pno);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()){
			 out.print("<link rel='stylesheet' href='style.css'>");
			 
			 out.println("<table style='width:100%'>");
			 
			 out.println("<table border=1><tr><th>Product Code:<td>"+ rs.getInt(1) +"</td></th></tr></table>");
			 out.println("<table border=1><tr><th>Product Name:<td>"+ rs.getString(2) +"</td></th></tr></table>");
			 out.println("<table border=1><tr><th>Product Price:<td>"+ rs.getDouble(3) +"</td></th></tr></table>");
			 out.println("<table border=1><tr><th>Brand Name:<td>"+ rs.getString(4) +"</td></th></tr></table>");
		}else{
			out.print("Invalid Product Code");
			RequestDispatcher rd=request.getRequestDispatcher("CatlogServlet");
  			rd.include(request, response);
		}
	   }
		catch(ClassNotFoundException | SQLException e){ 
			e.printStackTrace();
		}
        out.println("<p><a href='LogOutServlet'>logout</a></p></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}