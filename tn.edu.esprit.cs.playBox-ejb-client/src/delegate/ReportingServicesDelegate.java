package delegate;

import serviceLocator.ServiceLocator;
import services.interfaces.ReportingServicesRemote;
import domain.Play;

public class ReportingServicesDelegate {
	private static final String jndiName = "ejb:/tn.edu.esprit.cs.playBox-ejb/ReportingServices!services.interfaces.ReportingServicesRemote";
	private static ReportingServicesRemote reportingServicesRemote;

	public static Boolean doGameOver(Play play, Integer score) {
		return getReportingServicesRemote().gameOver(play, score);
	}

	public static ReportingServicesRemote getReportingServicesRemote() {
		reportingServicesRemote = (ReportingServicesRemote) ServiceLocator
				.getInstance().getProxy(jndiName);
		return reportingServicesRemote;
	}
}
