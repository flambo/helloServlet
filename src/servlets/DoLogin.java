package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//read form data
		String username = request.getParameter("username");//값을 읽어 들일 때 
		String password = request.getParameter("password");
		
		//perform business logic 
		
		PrintWriter out =  response.getWriter();
		
		//Build HTML code
		String htmlResponse = "<html>";
		htmlResponse+="<h2> Your name is: " + username+ "<br/>" ;
		htmlResponse+="Your password is: " + password+ "<h2>" ;
		htmlResponse+= "</html>";
		//html 파일 만들어서 클라이언트에게 보내주고 그럼 클라이언트는 브라우저에서 그 내용을 볼 수 있다.
		out.println(htmlResponse);
		
	}

}
