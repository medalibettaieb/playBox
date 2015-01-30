package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.dao.UserDao;
import tn.edu.esprit.cs.playBox.domain.User;

public class TestAddUser {

	public static void main(String[] args) {
		User user = new User();
		user.setName("foulen");

		System.out.println(UserDao.addUser(user));

	}

}
