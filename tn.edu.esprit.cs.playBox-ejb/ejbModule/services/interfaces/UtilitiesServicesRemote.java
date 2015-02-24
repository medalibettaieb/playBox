package services.interfaces;

import java.util.Date;

import javax.ejb.Remote;

import domain.Game;
import domain.Play;
import domain.Subscription;

@Remote
public interface UtilitiesServicesRemote {
	Game findGameById(Integer idGame);

	Subscription findSubscriptionById(Integer idSubscription);

	Play findPlayById(Subscription subscription, Game game, Date date);

}
