package training.oneToOneUni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: D
 * 
 */
@Entity
public class D implements Serializable {

	private Integer idD;
	private static final long serialVersionUID = 1L;

	private C c;

	public D() {
		super();
	}

	@Id
	public Integer getIdD() {
		return this.idD;
	}

	public void setIdD(Integer idD) {
		this.idD = idD;
	}

	@OneToOne
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

}
