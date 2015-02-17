package training.oneToManyUniSlaveMaster;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: I
 * 
 */
@Entity
public class I implements Serializable {

	private Integer idI;
	private static final long serialVersionUID = 1L;

	private List<J> js;

	public I() {
		super();
	}

	@Id
	public Integer getIdI() {
		return this.idI;
	}

	public void setIdI(Integer idI) {
		this.idI = idI;
	}

	@OneToMany
	public List<J> getJs() {
		return js;
	}

	public void setJs(List<J> js) {
		this.js = js;
	}

}
