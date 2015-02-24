package services.interfaces;

import javax.ejb.Remote;

import domain.Play;

@Remote
public interface ReportingServicesRemote {
	Boolean gameOver(Play play, Integer score);

}
