package services;

import javax.ejb.Stateless;

@Stateless
public class GreetingServices implements GreetingServicesRemote,
		GreetingServicesLocal {

	@Override
	public String sayAhla(String name) {
		return "ahla w sahla ya : " + name;
	}

}
