package domain;

import domain.Table;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TableGroup
 *
 */
@Entity

public class TableGroup extends Table implements Serializable {

	
	private int nbChaise;
	private static final long serialVersionUID = 1L;

	public TableGroup() {
		super();
	}   
	public int getNbChaise() {
		return this.nbChaise;
	}

	public void setNbChaise(int nbChaise) {
		this.nbChaise = nbChaise;
	}
   
}
