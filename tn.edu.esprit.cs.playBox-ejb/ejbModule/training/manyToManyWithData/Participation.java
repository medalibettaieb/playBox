package training.manyToManyWithData;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Participation
 * 
 */
@Entity
public class Participation implements Serializable {

	private ParticipationId participationId;
	private Date dateOfParticipation;
	private String type;
	private static final long serialVersionUID = 1L;

	private Employee employee;
	private Project project;

	public Participation() {
		super();
	}

	public Date getDateOfParticipation() {
		return this.dateOfParticipation;
	}

	public void setDateOfParticipation(Date dateOfParticipation) {
		this.dateOfParticipation = dateOfParticipation;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@EmbeddedId
	public ParticipationId getParticipationId() {
		return participationId;
	}

	public void setParticipationId(ParticipationId participationId) {
		this.participationId = participationId;
	}

	@ManyToOne
	@JoinColumn(name = "idEmployee", referencedColumnName = "id", insertable = false, updatable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "idProject", referencedColumnName = "id", updatable = false, insertable = false)
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
