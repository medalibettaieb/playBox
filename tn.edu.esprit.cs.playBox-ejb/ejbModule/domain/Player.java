package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Player
 * 
 */
@Entity
public class Player extends User implements Serializable {

	private Float cash;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}

	public Player(String name, String login, String password, Float cash) {
		super(name, login, password);
		this.cash = cash;
	}

	public Float getCash() {
		return this.cash;
	}

	public void setCash(Float cash) {
		this.cash = cash;
	}

}
