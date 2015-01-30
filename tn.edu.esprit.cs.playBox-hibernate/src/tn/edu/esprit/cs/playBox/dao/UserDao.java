package tn.edu.esprit.cs.playBox.dao;

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

}
