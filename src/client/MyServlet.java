package client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.ReturnObject;
import super_calculator.Calculator;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//if(request.getParameter("number1") != null && request.getParameter("operator") != null && request.getParameter("number2") != null) {
			Calculator calculator = new Calculator();
			System.out.println("Debug: " + request.getParameter("number1").toString() + " " + request.getParameter("operator").toString() + " " + request.getParameter("number2").toString());
			ReturnObject result = new ReturnObject(); 
			result = calculator.getResult(Integer.getInteger(request.getParameter("number1").toString()), request.getParameter("operator").toString(), Integer.getInteger(request.getParameter("number2").toString()));
			request.setAttribute("result1", result.getResult1());
			request.setAttribute("result2", result.getResult2());
	        request.getRequestDispatcher("/index.jsp").forward(request, response);
		//}
	}

}
