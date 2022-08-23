package com.crud.sql.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "startAt")
	private Date startAt;
	@Column(name = "finalAt")
	private Date finalAt;
	
	@OneToOne
    @JoinColumn(name = "researcher_id", referencedColumnName = "id")
    private Researcher researcher;
	
	@OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredAt;

	/**
	 * void constructor
	 */
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param startAt
	 * @param finalAt
	 * @param researcher
	 * @param team
	 * @param registeredAt
	 */
	public Booking(int id, Date startAt, Date finalAt, Researcher researcher, Team team, Date registeredAt) {
		super();
		this.id = id;
		this.startAt = startAt;
		this.finalAt = finalAt;
		this.researcher = researcher;
		this.team = team;
		this.registeredAt = registeredAt;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the startAt
	 */
	public Date getStartAt() {
		return startAt;
	}

	/**
	 * @param startAt the startAt to set
	 */
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	/**
	 * @return the finalAt
	 */
	public Date getFinalAt() {
		return finalAt;
	}

	/**
	 * @param finalAt the finalAt to set
	 */
	public void setFinalAt(Date finalAt) {
		this.finalAt = finalAt;
	}

	/**
	 * @return the researcher
	 */
	public Researcher getResearcher() {
		return researcher;
	}

	/**
	 * @param researcher the researcher to set
	 */
	public void setResearcher(Researcher researcher) {
		this.researcher = researcher;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}

	/**
	 * @return the registeredAt
	 */
	public Date getRegisteredAt() {
		return registeredAt;
	}

	/**
	 * @param registeredAt the registeredAt to set
	 */
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", startAt=" + startAt + ", finalAt=" + finalAt + ", researcher=" + researcher
				+ ", team=" + team + ", registeredAt=" + registeredAt + "]";
	}
	
	


	
	

}
