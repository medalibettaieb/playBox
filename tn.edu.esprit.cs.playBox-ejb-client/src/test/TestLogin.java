package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AccountManagementRemote;
import domain.Admin;
import domain.User;

public class TestLogin {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AccountManagementRemote proxy = (AccountManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");

		User userLogged = proxy.login("foulen2015", "password");
		if (userLogged != null) {
			if (userLogged instanceof Admin) {
				System.out.println("you are logged in as an admin");
			} else {
				System.out.println("you are logged in as an player");
			}
		} else {
			System.out.println("user not found ...");
		}

	}

}
