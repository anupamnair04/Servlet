package com.crudtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBooksServlet
 */
public class AddBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooksServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();

		String bname = request.getParameter("bkname");
        String bdesc = request.getParameter("bkdes");
        String athname = request.getParameter("authname");          
        String cat = request.getParameter("category");
        books book = new books(bname, bdesc, athname, cat);
        try{
            BooksDao bkdao = new BooksDao(ConnectionDao.getCon());
            if(bkdao.addBook(book)){
                response.sendRedirect("index.jsp");
            }else{
                out.print("Wrong Credential");
            }  
        }catch(Exception e){
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