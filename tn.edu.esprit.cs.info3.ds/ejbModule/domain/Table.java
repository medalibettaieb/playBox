package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Table
 * 
 */
@Entity
@javax.persistence.Table(name="T_TABLE")
public class Table implements Serializable {

	private String num;
	private Boolean isAvailable;
	private static final long serialVersionUID = 1L;

	private List<Reservation> reservations;

	public Table() {
		super();
	}

	@Id
	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Boolean getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@OneToMany
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
