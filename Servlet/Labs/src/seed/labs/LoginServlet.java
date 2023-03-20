package seed.labs;

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
		
PrintWriter out = response.getWriter();
		
		try{
			
			String nm = request.getParameter("username");
			String pwd = request.getParameter("password");
		
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
		
		PreparedStatement pst = con.prepareStatement("select * from userinfo where username = ? and password =?");
		pst.setString(1, nm);
		pst.setString(2, pwd);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()){
			out.print("Login Successful");
			response.sendRedirect("http://www.javatpoint.com"); 
		}else{
			out.print("Login Failed");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
  			rd.include(request, response);
		}
	   }
		catch(ClassNotFoundException | SQLException e){ 
			e.printStackTrace();
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}