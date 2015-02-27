package test;

import delegate.ReportingServicesDelegate;
import domain.Play;

public class TestServiceLocator {

	public static void main(String[] args) {
		Play play = null;
		Integer score = null;
		ReportingServicesDelegate.doGameOver(play, score);
	}
}
