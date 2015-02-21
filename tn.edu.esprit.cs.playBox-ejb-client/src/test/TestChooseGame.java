package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AssignmentManagementRemote;

public class TestChooseGame {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AssignmentManagementRemote proxy = (AssignmentManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AssignmentManagement!services.interfaces.AssignmentManagementRemote");

		System.out.println(proxy.chooseGame(3, 1));
	}

}
