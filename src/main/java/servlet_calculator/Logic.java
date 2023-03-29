package servlet_calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Logic extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("box1");
		int number=Integer.parseInt("box1");
		for(int i=1;i<=number;i++){
			res.getWriter().print("<h1>"+i+"</h1>");
		}
	
	}

}
