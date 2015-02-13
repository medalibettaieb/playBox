package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.AccountManagementLocal;
import services.interfaces.AccountManagementRemote;
import domain.Player;

/**
 * Session Bean implementation class AccountManagement
 */
@Stateless
public class AccountManagement implements AccountManagementRemote,
		AccountManagementLocal {
	@PersistenceContext
	private EntityManager entityManager;
	/**
	 * Default constructor.
	 */
	public AccountManagement() {
	}
	@Override
	public Boolean addPlayer(Player player) {
		Boolean b = false;
		try {
			entityManager.persist(player);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
