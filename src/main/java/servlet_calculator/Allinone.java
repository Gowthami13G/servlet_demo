package servlet_calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/calci")
public class Allinone extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Integer num1= Integer.parseInt(req.getParameter("num1"));
		Integer num2= Integer.parseInt(req.getParameter("num2"));
		char sym=req.getParameter("btn").charAt(0);
		
		
		switch (sym) {
		case '+':
			res.getWriter().print("<h1 style='color:purple'>Sum of "+ num1+" "+"and"+" "+num2+" is"+" "+(num1+num2)+"</h1>");
			
			break;
        case '-':
        	res.getWriter().print("<h1 style='color:orange'>Diff of "+ num1+" "+"and"+" "+num2+" is"+" "+(num1-num2)+"</h1>");
			
			break;
        case '*':
	
        	res.getWriter().print("<h1 style='color:goldenrod'>product of "+ num1+" "+"and"+" "+num2+" is"+" "+(num1*num2)+"</h1>");
	
			break;

        case '/':
        	res.getWriter().print("<h1 style='color:blue'>div of "+ num1+" "+"and"+" "+num2+" is"+" "+(num1/num2)+"</h1>");
	
        	break;

		default:
			break;
		}
		
	}

}
