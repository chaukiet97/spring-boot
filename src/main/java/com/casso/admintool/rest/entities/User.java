package com.casso.admintool.rest.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {
  private Integer id;
	private String email;
	private String firstname;
	private String lastname;
	private String name;
	private String password_hash;
	private Integer active;
	private Integer business_id_lastest;
	private Integer status;

  public User(String email, String firstname, String lastname, String name, String password_hash) {
    super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.name = name;
		this.password_hash = password_hash;
  }

  public User() {
		super();
	}


  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "firstname")
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname")
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@JsonIgnore
	@Column(name = "password_hash")
	public String getPasswordHash() {
		return password_hash;
	}

	public void setPasswordHash(String password_hash) {
		this.password_hash = password_hash;
	}

}
