package tn.edu.esprit.cs.playBox.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import tn.edu.esprit.cs.playBox.domain.User;
import tn.edu.esprit.cs.playBox.util.HibernateUtilities;

public class UserDao {
	private Session session = HibernateUtilities.getInstanceOf()
			.giveMeSession();

	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			session.getTransaction().begin();
			session.persist(user);
			session.getTransaction().commit();
			b = true;
		} catch (Exception e) {
			System.err.println("add problem ...");
			session.getTransaction().rollback();
		}
		return b;
	}

	public User findUserById(Integer id) {
		User userFound = null;
		try {
			session.getTransaction().begin();
			userFound = (User) session.get(User.class, id);
			// session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("find problem ...");
			session.getTransaction().rollback();
		}
		return userFound;
	}

	public Boolean deletUser(User user) {
		Boolean b = false;
		try {
			session.getTransaction().begin();
			session.delete(user);
			session.getTransaction().commit();
			b = true;
		} catch (Exception e) {
			System.err.println("deleting  problem ...");
			session.getTransaction().rollback();
		}
		return b;
	}

	public Boolean updateUser(User user) {
		Boolean b = false;
		try {
			session.getTransaction().begin();
			session.update(user);
			session.getTransaction().commit();
			b = true;
		} catch (Exception e) {
			System.err.println("updating  problem ...");
			session.getTransaction().rollback();
		}
		return b;
	}

	public List<User> findAllUsers() {
		List<User> users = new ArrayList<>();
		String hql = "from User";
		try {
			session.getTransaction().begin();
			Query query = session.createQuery(hql);
			users = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}

		return users;
	}

}
