package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.GreetingServicesRemote;

public class TestSayAhla {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		GreetingServicesRemote proxy = (GreetingServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/GreetingServices!"
						+ GreetingServicesRemote.class.getCanonicalName());

		System.out.println(proxy.sayAhla("zoubair"));
	}

}
