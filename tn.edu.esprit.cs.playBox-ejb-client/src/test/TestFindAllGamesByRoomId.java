package test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AssignmentManagementRemote;
import domain.Game;

public class TestFindAllGamesByRoomId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AssignmentManagementRemote proxy = (AssignmentManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AssignmentManagement!services.interfaces.AssignmentManagementRemote");

		List<Game> games = proxy.findAllGamesByRoomId(1);
		System.out.println(games.get(0).getName());
	}

}
