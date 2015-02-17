package training.oneToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: E
 * 
 */
@Entity
public class E implements Serializable {

	private Integer idE;
	private static final long serialVersionUID = 1L;

	private List<F> fs;

	public E() {
		super();
	}

	@Id
	public Integer getIdE() {
		return this.idE;
	}

	public void setIdE(Integer idE) {
		this.idE = idE;
	}

	@OneToMany(mappedBy = "e")
	public List<F> getFs() {
		return fs;
	}

	public void setFs(List<F> fs) {
		this.fs = fs;
	}

}
