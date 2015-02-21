package services.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.InitAppLocal;
import services.interfaces.InitAppRemote;
import domain.Admin;
import domain.Game;
import domain.Player;
import domain.Room;

/**
 * Session Bean implementation class InitApp
 */
@Singleton
@Startup
public class InitApp implements InitAppRemote, InitAppLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public InitApp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@PostConstruct
	public void init() {
		Admin admin = new Admin("admin", "admin", "admin", 1000F);

		Player player = new Player("player1", "player1", "player1", 10F);
		Player player2 = new Player("player2", "player2", "player2", 20F);
		Player player3 = new Player("player3", "player3", "player3", 30F);

		Game game = new Game("game1");
		Game game2 = new Game("game2");
		Game game3 = new Game("game3");

		Room room = new Room("R1", 100, "silver");
		Room room2 = new Room("R2", 2, "gold");

		entityManager.persist(admin);
		entityManager.persist(player);
		entityManager.persist(player2);
		entityManager.persist(player3);
		entityManager.persist(game);
		entityManager.persist(game2);
		entityManager.persist(game3);
		entityManager.persist(room);
		entityManager.persist(room2);
	}

}
