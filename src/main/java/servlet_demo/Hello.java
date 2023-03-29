package servlet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/hello")
public class Hello implements Servlet{

	static{
		System.out.println("i am sib");
	}
	public Hello(){
		System.out.println("i am constructor() of hello class");
	}
	public void destroy() {
		System.out.println("i am destroy");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	 
		
	}

}
