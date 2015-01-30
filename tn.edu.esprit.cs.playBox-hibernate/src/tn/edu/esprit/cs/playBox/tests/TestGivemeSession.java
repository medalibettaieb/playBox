package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.util.HibernateUtilities;

public class TestGivemeSession {

	public static void main(String[] args) {
		HibernateUtilities.getInstanceOf().giveMeSession();

	}

}
