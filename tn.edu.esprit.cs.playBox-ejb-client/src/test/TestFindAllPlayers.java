package test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AccountManagementRemote;
import domain.User;

public class TestFindAllPlayers {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AccountManagementRemote proxy = (AccountManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");
		List<User> users = proxy.findAllUsers();
		for (User u : users) {
			System.out.println(u.getName());
		}

	}

}
