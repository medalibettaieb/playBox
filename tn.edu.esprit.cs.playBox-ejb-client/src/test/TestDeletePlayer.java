package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AccountManagementRemote;

public class TestDeletePlayer {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AccountManagementRemote proxy = (AccountManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");

		proxy.deleteUser(1);
	}

}
