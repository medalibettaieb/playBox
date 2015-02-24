package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Play
 * 
 */
@Entity
public class Play implements Serializable {

	private static final long serialVersionUID = 1L;

	private PlayId playeId;
	private Integer score;
	private Subscription subscription;
	private Game game;

	public Play() {
		super();
	}

	public Play(Subscription subscription, Game game) {
		super();
		this.subscription = subscription;
		this.game = game;
		this.playeId = new PlayId(subscription.getId(), game.getId());
	}

	@EmbeddedId
	public PlayId getPlayeId() {
		return playeId;
	}

	public void setPlayeId(PlayId playeId) {
		this.playeId = playeId;
	}

	@ManyToOne
	@JoinColumn(name = "idSubscription", referencedColumnName = "id", insertable = false, updatable = false)
	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@ManyToOne
	@JoinColumn(name = "idGame", referencedColumnName = "id", insertable = false, updatable = false)
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
