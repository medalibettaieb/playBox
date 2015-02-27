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
import delegate.ReportingServicesDelegate;
import domain.Game;
import domain.Play;
import domain.Subscription;

public class TestReportingServicesWithDelegate {


	@Test
	public void testGameOver() throws ParseException {

		
		Play play = null;
		Integer score = null;
		Assert.assertTrue(ReportingServicesDelegate.doGameOver(play, score));
		
	}

}
