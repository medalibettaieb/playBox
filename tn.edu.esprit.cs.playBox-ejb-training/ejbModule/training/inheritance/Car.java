package training.inheritance;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;
import training.inheritance.Vehicle;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity

public class Car extends Vehicle implements Serializable {

	
	private Integer seatsNumber;
	private static final long serialVersionUID = 1L;

	public Car() {
		super();
	}   
	public Integer getSeatsNumber() {
		return this.seatsNumber;
	}

	public void setSeatsNumber(Integer seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
   
}
