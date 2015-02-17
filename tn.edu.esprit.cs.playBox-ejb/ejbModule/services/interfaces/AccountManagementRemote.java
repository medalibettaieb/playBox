package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface AccountManagementRemote {
	Boolean addUser(User user);

	User findUserById(Integer id);

	Boolean deleteUser(Integer id);

	Boolean updateUser(User user);

	List<User> findAllUsers();

	User login(String login, String password);
	
	User loginBis(User user);

}
