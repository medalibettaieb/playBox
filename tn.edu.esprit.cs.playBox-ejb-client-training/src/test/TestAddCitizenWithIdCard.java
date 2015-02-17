package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.PlatformServicesRemote;
import domain.Citizen;
import domain.IdCard;

public class TestAddCitizenWithIdCard {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		PlatformServicesRemote proxy = (PlatformServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.cs.playBox-ejb-training/PlatformServices!services.PlatformServicesRemote");
		Citizen citizen = new Citizen();
		citizen.setName("foulen");

		IdCard card = new IdCard();
		card.setType("CIN");

		proxy.addCitizenWithIdCard(citizen, card);

	}
}
