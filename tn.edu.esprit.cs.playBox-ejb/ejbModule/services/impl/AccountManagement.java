package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		List<User> users = null;
		try {
			String jpql = "select u from User u";
			Query query = entityManager.createQuery(jpql);
			users = query.getResultList();
		} catch (Exception e) {
		}
		return users;
	}

	@Override
	public User login(String login, String password) {
		User user = null;
		try {
			String jpql = "select u from User u where u.login = :l and u.password = :p ";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("l", login);
			query.setParameter("p", password);
			user = (User) query.getSingleResult();
		} catch (Exception e) {
		}
		return user;
	}

	@Override
	public User loginBis(User user) {
		return entityManager.find(User.class, user);
	}

}
