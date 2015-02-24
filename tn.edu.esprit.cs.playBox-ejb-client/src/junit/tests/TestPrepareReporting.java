package junit.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import services.interfaces.AssignmentManagementRemote;

public class TestPrepareReporting {
	private Context context;
	private AssignmentManagementRemote assignmentManagementRemote;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		assignmentManagementRemote = (AssignmentManagementRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/AssignmentManagement!services.interfaces.AssignmentManagementRemote");

	}

	@Test
	public void test() {
		assignmentManagementRemote.assignGameToRoom(1, 1);
		assignmentManagementRemote.subscribePlayerToRoom(2, 2);
		assignmentManagementRemote.chooseGame(3, 1);

	}

}
