package domain;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	
	private Integer id;
	private Date date;
	private static final long serialVersionUID = 1L;
	
	private List<ReservationDetails> reservationDetails;

	public Reservation() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	@OneToMany(mappedBy="reservation")
	public List<ReservationDetails> getReservationDetails() {
		return reservationDetails;
	}
	public void setReservationDetails(List<ReservationDetails> reservationDetails) {
		this.reservationDetails = reservationDetails;
	}
   
}
