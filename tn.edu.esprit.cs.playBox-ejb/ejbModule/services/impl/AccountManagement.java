package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.AccountManagementLocal;
import services.interfaces.AccountManagementRemote;
import domain.User;

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
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
