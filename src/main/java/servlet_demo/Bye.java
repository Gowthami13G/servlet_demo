package servlet_demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Bye extends GenericServlet
{	
	static{
		System.out.println("i am sib");
	}
	public Bye(){
		System.out.println("i am constructor() of bye class");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		
	}

}
