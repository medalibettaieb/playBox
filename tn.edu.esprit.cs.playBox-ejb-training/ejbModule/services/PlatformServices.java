package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Citizen;
import domain.Father;
import domain.IdCard;
import domain.Son;

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

	@Override
	public Boolean addFatherToSon(Son son, Father father) {
		Boolean b = false;
		try {
			son.setFather(father);
			entityManager.persist(son);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean addSonToFather(Son son, Integer id) {
		Boolean b = false;
		Father father = entityManager.find(Father.class, id);
		try {
			List<Son> sons = findAllSonsByFatherId(id);
			if (sons.size() < 3) {
				sons.add(son);
				father.linkSonsToThisFather(sons);

				entityManager.persist(father);
				b = true;
			} else {
				System.out.println("yezzi fih elbarka ...");
			}

		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Son> findAllSonsByFatherId(Integer id) {
		List<Son> sons = null;
		Father fatherFounded = null;
		try {
			fatherFounded = entityManager.find(Father.class, id);
		} catch (Exception e) {
			System.err.println("father not found ...");
		}
		try {
			sons = fatherFounded.getSons();
		} catch (Exception e) {
			System.err.println("sons's father not found ...");
		}

		return sons;
	}

	@Override
	public Boolean addSonToNewFather(Son son, Father father) {
		Boolean b = false;
		try {
			List<Son> sons = findAllSonsByFatherId(father.getId());
			sons.add(son);

			father.linkSonsToThisFather(sons);

			entityManager.persist(father);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
