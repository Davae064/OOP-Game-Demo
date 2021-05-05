package Entities;

import java.time.LocalDate;

public class Gamers {

	private int id;
	private String name;
	private String surname;
	private String username;
	private LocalDate dateOfBirth;
	private String nationalId;
	
	public Gamers(int id, String name, String surname, String username, LocalDate dateOfBirth, String nationalId) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getUsername() {
		return username;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationalId() {
		return nationalId;
	}
	
}
