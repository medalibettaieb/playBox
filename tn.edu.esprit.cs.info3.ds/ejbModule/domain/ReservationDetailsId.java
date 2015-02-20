package domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReservationDetailsId implements Serializable {

	private Integer idReservation;
	private Integer idMenu;
	private static final long serialVersionUID = 1L;

	public ReservationDetailsId() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ReservationDetailsId(Integer idReservation, Integer idMenu) {
		super();
		this.idReservation = idReservation;
		this.idMenu = idMenu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMenu == null) ? 0 : idMenu.hashCode());
		result = prime * result
				+ ((idReservation == null) ? 0 : idReservation.hashCode());
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
		ReservationDetailsId other = (ReservationDetailsId) obj;
		if (idMenu == null) {
			if (other.idMenu != null)
				return false;
		} else if (!idMenu.equals(other.idMenu))
			return false;
		if (idReservation == null) {
			if (other.idReservation != null)
				return false;
		} else if (!idReservation.equals(other.idReservation))
			return false;
		return true;
	}

}
