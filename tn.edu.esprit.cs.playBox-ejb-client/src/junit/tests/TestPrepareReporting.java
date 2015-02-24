package junit.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import services.interfaces.AssignmentManagementRemote;
import services.interfaces.UtilitiesServicesRemote;
import domain.Game;
import domain.Subscription;

public class TestPrepareReporting {
	private Context context;
	private AssignmentManagementRemote assignmentManagementRemote;
	private UtilitiesServicesRemote utilitiesServicesRemote;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		assignmentManagementRemote = (AssignmentManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AssignmentManagement!services.interfaces.AssignmentManagementRemote");
		utilitiesServicesRemote = (UtilitiesServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/UtilitiesServices!services.interfaces.UtilitiesServicesRemote");
	}

	@Test
	@Ignore
	public void test() {
		assignmentManagementRemote.assignGameToRoom(1, 2);
		assignmentManagementRemote.assignGameToRoom(2, 2);
		assignmentManagementRemote.subscribePlayerToRoom(2, 2);

	}

	@Test

	public void testPlayGame() {
		Subscription subscription = utilitiesServicesRemote
				.findSubscriptionById(1);
		Game game = utilitiesServicesRemote.findGameById(1);
		Assert.assertTrue(assignmentManagementRemote.playGame(subscription,
				game));
	}
}
