package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Room
 * 
 */
@Entity
public class Room implements Serializable {

	private Integer id;
	private String name;
	private Integer nbMaxPerson;
	private String type;
	private static final long serialVersionUID = 1L;

	private List<Subscription> subscriptions;
	private List<Game> games;

	public Room() {
		super();
	}

	public Room(String name, Integer nbMaxPerson, String type) {
		super();
		this.name = name;
		this.nbMaxPerson = nbMaxPerson;
		this.type = type;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNbMaxPerson() {
		return this.nbMaxPerson;
	}

	public void setNbMaxPerson(Integer nbMaxPerson) {
		this.nbMaxPerson = nbMaxPerson;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(mappedBy = "room")
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@ManyToMany(mappedBy = "rooms")
	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

}
