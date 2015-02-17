package training.inheritance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import training.inheritance.Vehicle;

/**
 * Entity implementation class for Entity: MotoBike
 *
 */
@Entity

public class MotoBike extends Vehicle implements Serializable {

	
	private String hamletColor;
	private static final long serialVersionUID = 1L;

	public MotoBike() {
		super();
	}   
	public String getHamletColor() {
		return this.hamletColor;
	}

	public void setHamletColor(String hamletColor) {
		this.hamletColor = hamletColor;
	}
   
}
