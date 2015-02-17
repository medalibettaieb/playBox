package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AccountManagementRemote;
import domain.Admin;
import domain.User;

public class TestLoginBis {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AccountManagementRemote proxy = (AccountManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");

		User userLogged = new User();
		userLogged.setId(11);
		userLogged.setPassword("password");
		userLogged.setLogin("foulen2015");
		User user = proxy.loginBis(userLogged);
		if (user != null) {
			if (user instanceof Admin) {
				System.out.println("you are logged in as an admin");
			} else {
				System.out.println("you are logged in as an player");
			}
		} else {
			System.out.println("user not found ...");
		}

	}

}
