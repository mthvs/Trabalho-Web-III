package App;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class AppServelet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("O Método é: " + req.getMethod());
		resp.getWriter().print("<p> A URI do pedido é: " + req.getRequestURI() +"</p>");
		resp.getWriter().print("<p> O Protocolo é: " + req.getProtocol()+"</p>");
		
	}
}
