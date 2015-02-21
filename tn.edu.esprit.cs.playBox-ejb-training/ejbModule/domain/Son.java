package domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Son
 * 
 */
@Entity
public class Son implements Serializable {

	private Integer id;
	private Double age;
	private static final long serialVersionUID = 1L;

	private Father father;

	public Son() {
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

	public Double getAge() {
		return this.age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

}
