package services.interfaces;

import javax.ejb.Remote;

import domain.Player;

@Remote
public interface AccountManagementRemote {
	Boolean addPlayer(Player player);

}
