package domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

import com.sun.org.apache.bcel.internal.generic.CASTORE;

/**
 * Entity implementation class for Entity: Citizen
 *
 */
@Entity

public class Citizen implements Serializable {

	
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;
	
	private IdCard idCard;

	public Citizen() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@OneToOne(cascade=CascadeType.PERSIST)
	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
   
}
