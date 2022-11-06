package com.crud.sql.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="faculty")
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Researcher> researcher;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Team> team;

	/**
	 * void constructor
	 */
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param researcher
	 * @param team
	 */
	public Faculty(int id, String name, List<Researcher> researcher, List<Team> team) {
		super();
		this.id = id;
		this.name = name;
		this.researcher = researcher;
		this.team = team;
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
	 * @return the nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setName(String nombre) {
		this.name = nombre;
	}

	/**
	 * @return the researcher
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Researcher")
	public List<Researcher> getResearcher() {
		return researcher;
	}

	/**
	 * @param researcher the researcher to set
	 */
	public void setResearcher(List<Researcher> researcher) {
		this.researcher = researcher;
	}

	/**
	 * @return the team
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Team")
	public List<Team> getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(List<Team> team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", researcher=" + researcher + ", team=" + team + "]";
	}
	
	
	
	
	
	

}

