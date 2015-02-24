package junit.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import services.interfaces.ReportingServicesRemote;

public class TestReportingServices {
	private Context context;
	private ReportingServicesRemote proxy;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		proxy = (ReportingServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/ReportingServices!services.interfaces.ReportingServicesRemote");
	}

	@Test
	public void testAttributeScoreToPlayer() {
		Assert.assertTrue(proxy.attributeScoreToPlayer(1, 20));
	}

}
