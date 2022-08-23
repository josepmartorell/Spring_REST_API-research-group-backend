package com.crud.sql.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "serie_num", unique = true)
	private char serie_num;
	@Column(name = "name")
	private String name;
	
	@OneToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;
	
	@ManyToOne
	@JoinColumn(name="faculty_id", referencedColumnName = "id")
	private Faculty faculty;

	/**
	 * 
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param serie_num
	 * @param name
	 * @param booking
	 * @param faculty
	 */
	public Team(int id, char serie_num, String name, Booking booking, Faculty faculty) {
		super();
		this.id = id;
		this.serie_num = serie_num;
		this.name = name;
		this.booking = booking;
		this.faculty = faculty;
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
	 * @return the serie_num
	 */
	public char getSerie_num() {
		return serie_num;
	}

	/**
	 * @param serie_num the serie_num to set
	 */
	public void setSerie_num(char serie_num) {
		this.serie_num = serie_num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the booking
	 */
	public Booking getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	/**
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", serie_num=" + serie_num + ", name=" + name + ", booking=" + booking + ", faculty="
				+ faculty + "]";
	}
	
	

}
