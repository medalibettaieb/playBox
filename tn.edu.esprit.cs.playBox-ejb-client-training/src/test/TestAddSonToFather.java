package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.PlatformServicesRemote;
import domain.Father;
import domain.Son;

public class TestAddSonToFather {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		PlatformServicesRemote proxy = (PlatformServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb-training/PlatformServices!services.PlatformServicesRemote");

		Son son = new Son();
		son.setAge(11D);

		Father father = new Father();
		father.setName("foulen");

		proxy.addSonToNewFather(son, father);

	}
}
