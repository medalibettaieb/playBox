package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.dao.UserDao;
import tn.edu.esprit.cs.playBox.domain.User;

public class TestUpdateUser {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();

		User userFound = userDao.findUserById(4);

		userFound.setName("newlook");

		userDao.updateUser(userFound);

	}

}
