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
		return entityManager.find(User.class, id);
	}

	@Override
	public Boolean deleteUser(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findUserById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateUser(User user) {
		Boolean b = false;
		try {
			entityManager.merge(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
