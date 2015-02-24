package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface ReportingServicesRemote {
	Boolean attributeScoreToPlayer(Integer idSubscription, Integer score);

}
