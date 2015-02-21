package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.Game;

@Remote
public interface AssignmentManagementRemote {
	Boolean assignGameToRoom(Integer idGame, Integer idRoom);

	List<Game> findAllGamesByRoomId(Integer id);

	Boolean subscribePlayerToRoom(Integer idPlayer, Integer idRoom);
	
	Boolean chooseGame(Integer idGame,Integer idSubscription);

}
