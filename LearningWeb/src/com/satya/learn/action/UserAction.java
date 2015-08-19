/**
 * 
 */
package com.satya.learn.action;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 703162557
 *
 */
public class UserAction {

	/**
	 * 
	 */
	public UserAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Authenticates the credentials to provide the status of login
	 * attempt/request.
	 * @param request 
	 * @param username Username of the requesting user.
	 * @param password Password of the requesting user.
	 * @return Login authentication status of the current attempt.
	 */
	public boolean authLogin(HttpServletRequest request, String username, String password) {
		boolean isLogin = false;
		if (username != null && password != null && username.equalsIgnoreCase("satya") && password.equals("123")){
			isLogin = true;
			request.getSession().setAttribute("currently_logged_user", username);
		}
		return isLogin;
	}

}
