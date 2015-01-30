package tn.edu.esprit.cs.playBox.tests;

import org.hibernate.Session;

import tn.edu.esprit.cs.playBox.util.HibernateUtilities;

public class TestGivemeSession {

	public static void main(String[] args) {
		Session session = HibernateUtilities.getInstanceOf().giveMeSession();
		Session session2 = HibernateUtilities.getInstanceOf().giveMeSession();

		System.out.println(session.hashCode());
		System.out.println(session2.hashCode());

	}

}
