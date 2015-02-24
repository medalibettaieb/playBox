package services.impl;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.UtilitiesServicesLocal;
import services.interfaces.UtilitiesServicesRemote;
import domain.Game;
import domain.Play;
import domain.PlayId;
import domain.Subscription;

/**
 * Session Bean implementation class UtilitiesServices
 */
@Stateless
public class UtilitiesServices implements UtilitiesServicesRemote,
		UtilitiesServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UtilitiesServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Game findGameById(Integer idGame) {
		return entityManager.find(Game.class, idGame);
	}

	@Override
	public Subscription findSubscriptionById(Integer idSubscription) {
		return entityManager.find(Subscription.class, idSubscription);
	}

	@Override
	public Play findPlayById(Subscription subscription, Game game, Date date) {
		PlayId playId = new PlayId(subscription.getId(), game.getId(), date);
		return entityManager.find(Play.class, playId);
	}

}
