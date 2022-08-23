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
@Table(name="researcher")
public class Researcher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dni", unique = true)
	private String dni;
	@Column(name = "surname_name")
	private String surname_name;
	
	@OneToOne
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;
	
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;

	/**
	 * void constructor
	 */
	public Researcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param dni
	 * @param surname_name
	 * @param booking
	 * @param faculty
	 */
	public Researcher(int id, String dni, String surname_name, Booking booking, Faculty faculty) {
		super();
		this.id = id;
		this.dni = dni;
		this.surname_name = surname_name;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the surname_name
	 */
	public String getSurname_name() {
		return surname_name;
	}

	/**
	 * @param surname_name the surname_name to set
	 */
	public void setSurname_name(String surname_name) {
		this.surname_name = surname_name;
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
		return "Researcher [id=" + id + ", dni=" + dni + ", surname_name=" + surname_name + ", booking=" + booking
				+ ", faculty=" + faculty + "]";
	}
	
	
	
	
	
	

}
