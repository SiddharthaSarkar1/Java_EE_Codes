package com.sidd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		System.out.println("Session Created. Listener will be invoked.");
		session.setAttribute("username", "Sidd1");
		session.setAttribute("password", "Sid123");
		System.out.println("Session attribute displayed. Listener to come here.");
		session.setAttribute("username", "Sidd2");
		System.out.println("Attribute Modified. Listener will be invoked.");
		session.invalidate();
		System.out.println("Session destroyed.");
	}

}
