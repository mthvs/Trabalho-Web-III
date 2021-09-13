package App;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class AppServelet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("O Host �: " + req.getHeader("Host"));
		resp.getWriter().print("<p>O seu navegador �: " + req.getHeader("user-agent")+"</p>");
		resp.getWriter().print("<p>O tipo de codigo que aceita �: " + req.getHeader("aceppt-encoding") +"</p>");
		resp.getWriter().print("<p>A liguagem que aceita �: " + req.getHeader("accept-language")+"</p>");
		
		
	}
}