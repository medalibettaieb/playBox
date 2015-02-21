package services;

import java.util.List;

import javax.ejb.Remote;

import domain.Citizen;
import domain.Father;
import domain.IdCard;
import domain.Son;

@Remote
public interface PlatformServicesRemote {
	Boolean addCitizenWithIdCard(Citizen citizen, IdCard card);

	Boolean addIdCardWithCitizen(Citizen citizen, IdCard card);

	Boolean addFatherToSon(Son son, Father father);

	Boolean addSonToFather(Son son, Integer id);

	Boolean addSonToNewFather(Son son, Father father);

	List<Son> findAllSonsByFatherId(Integer id);
}
