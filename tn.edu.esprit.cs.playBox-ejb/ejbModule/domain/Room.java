package domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Room
 *
 */
@Entity

public class Room implements Serializable {

	
	private Integer id;
	private String name;
	private Integer nbMaxPerson;
	private String type;
	private static final long serialVersionUID = 1L;

	public Room() {
		super();
	}   
	@Id    
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
	public Integer getNbMaxPerson() {
		return this.nbMaxPerson;
	}

	public void setNbMaxPerson(Integer nbMaxPerson) {
		this.nbMaxPerson = nbMaxPerson;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
