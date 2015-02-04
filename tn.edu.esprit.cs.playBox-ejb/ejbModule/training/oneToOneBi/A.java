package training.oneToOneBi;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	
	private Integer idA;
	private static final long serialVersionUID = 1L;
	
	private B b;

	public A() {
		super();
	}   
	@Id    
	public Integer getIdA() {
		return this.idA;
	}

	public void setIdA(Integer idA) {
		this.idA = idA;
	}
	@OneToOne
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
   
}
