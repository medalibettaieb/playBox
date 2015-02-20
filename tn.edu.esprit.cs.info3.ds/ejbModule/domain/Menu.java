package domain;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Menu
 *
 */
@Entity

public class Menu implements Serializable {

	
	private Integer id;
	private String nom;
	private Double prix;
	private static final long serialVersionUID = 1L;
	
	private List<ReservationDetails> reservationDetails;

	public Menu() {
		super();
	}   
	@Id    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public Double getPrix() {
		return this.prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	@OneToMany(mappedBy="menu")
	public List<ReservationDetails> getReservationDetails() {
		return reservationDetails;
	}
	public void setReservationDetails(List<ReservationDetails> reservationDetails) {
		this.reservationDetails = reservationDetails;
	}
   
}
