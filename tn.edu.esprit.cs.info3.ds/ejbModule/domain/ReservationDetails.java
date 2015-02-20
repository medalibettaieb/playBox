package domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ReservationDetails
 * 
 */
@Entity
public class ReservationDetails implements Serializable {

	private ReservationDetailsId reservationDetailsId;
	private int quantity;
	private static final long serialVersionUID = 1L;

	private Reservation reservation;
	private Menu menu;

	public ReservationDetails() {
		super();
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@EmbeddedId
	public ReservationDetailsId getReservationDetailsId() {
		return reservationDetailsId;
	}

	public void setReservationDetailsId(
			ReservationDetailsId reservationDetailsId) {
		this.reservationDetailsId = reservationDetailsId;
	}

	@ManyToOne
	@JoinColumn(name = "idReservation", referencedColumnName = "id", insertable = false, updatable = false)
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@ManyToOne
	@JoinColumn(name = "idMenu", referencedColumnName = "id", insertable = false, updatable = false)
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
