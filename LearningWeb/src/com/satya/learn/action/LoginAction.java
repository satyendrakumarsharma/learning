/**
 * 
 */
package com.satya.learn.action;

/**
 * @author 703162557
 *
 */
public class LoginAction {

	/**
	 * 
	 */
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Authenticates the credentials to provide the status of login
	 * attempt/request.
	 * 
	 * @param username Username of the requesting user.
	 * @param password Password of the requesting user.
	 * @return Login authentication status of the current attempt.
	 */
	public boolean authLogin(String username, String password) {
		boolean isLogin = false;
		if (username != null && password != null && username.equalsIgnoreCase("satya") && password.equals("123"))
			isLogin = true;
		return isLogin;
	}

}
