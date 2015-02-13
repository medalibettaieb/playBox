package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.AccountManagementRemote;
import domain.Player;

public class TestAddPlayer {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AccountManagementRemote proxy = (AccountManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AccountManagement!services.interfaces.AccountManagementRemote");

		Player player = new Player();
		player.setName("foulen");
		player.setLogin("foulen2015");
		player.setPassword("password");
		player.setCash(500F);

		System.out.println(proxy.addPlayer(player));
	}

}
