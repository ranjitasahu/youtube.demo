package javalearning.net;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(description = "Login Servlet", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("We are in the service method of the servlet");
		String username = "user";
		String password = "root";
		
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
        String msg="";
        if(un.equals("username") && pw.equals("password"))
        {
        	
        	msg = "Hello" + un + "! your login is succesful";
        }
        else
        {
        	msg = "Hello" + un + "! your login failed";
        }
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<font size = '6' color=red>" + msg + "</font>");
        
	}

}
