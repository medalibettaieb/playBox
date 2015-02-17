package services;

import javax.ejb.Remote;

@Remote
public interface GreetingServicesRemote {
	String sayAhla(String name);

}
