package services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.ReportingServicesLocal;
import services.interfaces.ReportingServicesRemote;
import domain.Subscription;

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
	public Boolean attributeScoreToPlayer(Integer idSubscription, Integer score) {
		Boolean b = false;
		try {
			Subscription subscriptionSelected = entityManager.find(
					Subscription.class, idSubscription);
			subscriptionSelected.setScore(score);
			entityManager.merge(subscriptionSelected);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
