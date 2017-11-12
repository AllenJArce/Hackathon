package com.revature.oca.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class OcaUser implements Serializable {

	private static final long serialVersionUID = 63262800164352150L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OCA_USER_SEQ")
	@SequenceGenerator(sequenceName = "oca_user_seq", allocationSize = 1, name = "OCA_USER_SEQ")
	private int id;
	@Column(name = "FN")
	private String firstName;
	@Column(name = "LN")
	private String lastName;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "CORRECT")
	private int correct;
	@Column(name = "ATTEMPTED")
	private int attempted;

	public OcaUser() {
		super();
	}

	public OcaUser(int id, String firstName, String lastName, String userName, String password, int correct,
			int attempted) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.correct = correct;
		this.attempted = attempted;
	}

	public OcaUser(int id, int correct, int attempted) {
		super();
		this.id = id;
		this.correct = correct;
		this.attempted = attempted;
	}

	public OcaUser(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCorrect() {
		return correct;
	}

	public void setCorrect(int correct) {
		this.correct = correct;
	}

	public int getAttempted() {
		return attempted;
	}

	public void setAttempted(int attempted) {
		this.attempted = attempted;
	}

	@Override
	public String toString() {
		return "OcaUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", correct=" + correct + ", attempted=" + attempted + "]";
	}

}
