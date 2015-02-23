package junit.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import services.PlatformServicesRemote;
import domain.Father;
import domain.Son;

public class AddFatherToSonTest {
	private Context context;
	private PlatformServicesRemote proxy;

	@Before
	public void init() {
		try {
			context = new InitialContext();
			proxy = (PlatformServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb-training/PlatformServices!services.PlatformServicesRemote");

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testAddFatherToSon() {
		Son son = new Son();
		son.setAge(11D);

		Father father = new Father();
		father.setName("foulen");
		Assert.assertTrue(proxy.addFatherToSon(son, father));
	}

}
