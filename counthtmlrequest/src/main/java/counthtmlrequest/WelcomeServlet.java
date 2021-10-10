package counthtmlrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		int count=(int)sc.getAttribute("visited");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><center><br><br><br><br><br><h1>");
		pw.println("HTML page visited "+count+" times.");
		pw.println("</h1></center></body></html>");
	}

}
