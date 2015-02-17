package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: IdCard
 * 
 */
@Entity
public class IdCard implements Serializable {

	private Integer id;
	private String type;
	private static final long serialVersionUID = 1L;

	private Citizen citizen;

	public IdCard() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToOne(mappedBy = "idCard", cascade = CascadeType.PERSIST)
	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public void linkThisCardWithCitizen(Citizen citizen) {
		this.citizen = citizen;
		citizen.setIdCard(this);
	}

}
