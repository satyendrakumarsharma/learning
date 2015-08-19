package com.satya.learn.ctrl;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.satya.learn.action.LoginAction;

/**
 * Servlet implementation class CentralController
 */
@WebServlet(asyncSupported = true, description = "The main controller class that coordinates the different components of application.", urlPatterns = {
		"/CentralController" })
public class CentralController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CentralController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginAction loginAct = new LoginAction();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isLogin = loginAct.authLogin(username, password);
		response.getWriter().append("Served at: ").append(request.getContextPath())
				.append("<hr/><font color='")
				.append(isLogin ? "green'>LOGGEDIN" : "red'>LOGIN FAILED")
				.append("</font>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
