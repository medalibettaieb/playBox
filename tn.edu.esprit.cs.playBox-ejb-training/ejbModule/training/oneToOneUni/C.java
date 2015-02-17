package training.oneToOneUni;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: C
 *
 */
@Entity

public class C implements Serializable {

	
	private Integer idC;
	private static final long serialVersionUID = 1L;

	public C() {
		super();
	}   
	@Id    
	public Integer getIdC() {
		return this.idC;
	}

	public void setIdC(Integer idC) {
		this.idC = idC;
	}
   
}
