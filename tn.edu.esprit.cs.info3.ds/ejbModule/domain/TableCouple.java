package domain;

import domain.Table;
import java.io.Serializable;
import java.lang.Boolean;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TableCouple
 *
 */
@Entity

public class TableCouple extends Table implements Serializable {

	
	private Boolean dinerChandelle;
	private static final long serialVersionUID = 1L;

	public TableCouple() {
		super();
	}   
	public Boolean getDinerChandelle() {
		return this.dinerChandelle;
	}

	public void setDinerChandelle(Boolean dinerChandelle) {
		this.dinerChandelle = dinerChandelle;
	}
   
}
