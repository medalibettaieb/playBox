package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Citizen;
import domain.IdCard;

/**
 * Session Bean implementation class PlatformServices
 */
@Stateless
public class PlatformServices implements PlatformServicesRemote,
		PlatformServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PlatformServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addCitizenWithIdCard(Citizen citizen, IdCard card) {
		Boolean b = false;
		try {
			citizen.setIdCard(card);
			entityManager.persist(citizen);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean addIdCardWithCitizen(Citizen citizen, IdCard card) {
		Boolean b = false;
		try {
			card.linkThisCardWithCitizen(citizen);
			entityManager.persist(card);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
