package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.dao.UserDao;
import tn.edu.esprit.cs.playBox.domain.User;

public class TestFindUserById {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();

		User user = userDao.findUserById(1);

		System.out.println(user.getName());

	}

}
