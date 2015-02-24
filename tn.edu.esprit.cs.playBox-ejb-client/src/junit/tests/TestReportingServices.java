package junit.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import services.interfaces.ReportingServicesRemote;
import services.interfaces.UtilitiesServicesRemote;
import domain.Game;
import domain.Play;
import domain.Subscription;

public class TestReportingServices {
	private Context context;
	private ReportingServicesRemote proxy;
	private UtilitiesServicesRemote utilitiesServicesRemote;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		proxy = (ReportingServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/ReportingServices!services.interfaces.ReportingServicesRemote");
		utilitiesServicesRemote = (UtilitiesServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb/UtilitiesServices!services.interfaces.UtilitiesServicesRemote");
	}

	@Test
	public void testGameOver() throws ParseException {
		Subscription subscription = utilitiesServicesRemote
				.findSubscriptionById(1);
		Game game = utilitiesServicesRemote.findGameById(1);

		Date date;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateChosen = "2015-02-24";
		date = (Date) format.parse(dateChosen);

		
		
		Play play = utilitiesServicesRemote.findPlayById(subscription, game,
				date);
		Integer score = 100;
		Assert.assertTrue(proxy.gameOver(play, score));
		
	}

}
