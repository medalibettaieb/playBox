package domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Admin
 * 
 */
@Entity
public class Admin extends User implements Serializable {

	private Float salary;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(String name, String login, String password, Float salary) {
		super(name, login, password);
		this.salary = salary;

	}

	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
