package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: PlayId
 * 
 */
@Embeddable
public class PlayId implements Serializable {

	private Integer idSubscription;
	private Integer idGame;
	private Date dateOfGame;
	private static final long serialVersionUID = 1L;

	public PlayId() {
		super();
	}

	public PlayId(Integer idSubscription, Integer idGame, Date dateOfGame) {
		super();
		this.idSubscription = idSubscription;
		this.idGame = idGame;
		this.dateOfGame = dateOfGame;
	}

	public PlayId(Integer idSubscription, Integer idGame) {
		super();
		this.idSubscription = idSubscription;
		this.idGame = idGame;
		this.dateOfGame = new Date();
	}

	public Integer getIdSubscription() {
		return this.idSubscription;
	}

	public void setIdSubscription(Integer IdSubscription) {
		this.idSubscription = IdSubscription;
	}

	public Integer getIdGame() {
		return this.idGame;
	}

	public void setIdGame(Integer IdGame) {
		this.idGame = IdGame;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGame == null) ? 0 : idGame.hashCode());
		result = prime * result
				+ ((idSubscription == null) ? 0 : idSubscription.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayId other = (PlayId) obj;
		if (idGame == null) {
			if (other.idGame != null)
				return false;
		} else if (!idGame.equals(other.idGame))
			return false;
		if (idSubscription == null) {
			if (other.idSubscription != null)
				return false;
		} else if (!idSubscription.equals(other.idSubscription))
			return false;
		return true;
	}
@Temporal(TemporalType.DATE)
	public Date getDateOfGame() {
		return dateOfGame;
	}

	public void setDateOfGame(Date dateOfGame) {
		this.dateOfGame = dateOfGame;
	}

}
