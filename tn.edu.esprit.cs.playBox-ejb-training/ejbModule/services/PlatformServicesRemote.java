package services;

import javax.ejb.Remote;

import domain.Citizen;
import domain.IdCard;

@Remote
public interface PlatformServicesRemote {
	Boolean addCitizenWithIdCard(Citizen citizen, IdCard card);

	Boolean addIdCardWithCitizen(Citizen citizen, IdCard card);
}
