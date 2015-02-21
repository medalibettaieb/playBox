package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.PlatformServicesRemote;
import domain.Son;

public class TestAddSonToFatherBis {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		PlatformServicesRemote proxy = (PlatformServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb-training/PlatformServices!services.PlatformServicesRemote");

		Son son = new Son();
		son.setAge(11D);

		proxy.addSonToFather(son, 1);

	}
}
