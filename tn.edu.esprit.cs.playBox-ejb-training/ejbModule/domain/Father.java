package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Father
 * 
 */
@Entity
public class Father implements Serializable {

	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;

	private List<Son> sons;

	public Father() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "father", cascade = CascadeType.PERSIST)
	public List<Son> getSons() {
		return sons;
	}

	public void setSons(List<Son> sons) {
		this.sons = sons;
	}

	public void linkSonsToThisFather(List<Son> sons) {
		this.sons = sons;
		for (Son s : sons) {
			s.setFather(this);
		}
	}

}
