package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Subscription
 * 
 */
@Entity
public class Subscription implements Serializable {

	private Integer id;
	private Date dateOfSubscription;
	private static final long serialVersionUID = 1L;

	private User user;
	private Room room;
	private List<Play> plays;

	public Subscription() {
		super();
	}

	public Subscription(User user, Room room) {
		super();
		this.user = user;
		this.room = room;
		this.dateOfSubscription = new Date();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfSubscription() {
		return this.dateOfSubscription;
	}

	public void setDateOfSubscription(Date dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}



	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@OneToMany(mappedBy = "subscription")
	public List<Play> getPlays() {
		return plays;
	}

	public void setPlays(List<Play> plays) {
		this.plays = plays;
	}

}
