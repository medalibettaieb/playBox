package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.ReportingServicesLocal;
import services.interfaces.ReportingServicesRemote;
import domain.Play;

/**
 * Session Bean implementation class ReportingServices
 */
@Stateless
public class ReportingServices implements ReportingServicesRemote,
		ReportingServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ReportingServices() {
	}

	@Override
	public Boolean gameOver(Play play, Integer score) {
		Boolean b = false;
		try {
			play.setScore(score);
			entityManager.merge(play);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
