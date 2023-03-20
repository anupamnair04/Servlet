package seed.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		PrintWriter out = response.getWriter();
		//doGet(request, response);
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
        String url =("jdbc:oracle:thin:@localhost:1521:xe");
        
		//Establish Connection between Java Application & Oracle Data Base
		Connection con = DriverManager.getConnection(url,"system","anupam");
		
		String nm = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		
		PreparedStatement pst = con.prepareStatement("select * from login where username = ? and password =?");
		pst.setString(1, nm);
		pst.setString(2, pwd);
		
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			out.println("Login Successful");
		}else{
			out.println("Login Failed");
		}
	   }
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
	}
}