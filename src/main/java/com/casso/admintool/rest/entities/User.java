package com.casso.admintool.rest.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)

public class User implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email;
	private String firstname;
	private String lastname;
	private String name;
	private String password_hash;
	private Integer active;
	private Integer business_id_lastest;
	private Integer status;

	public User(Integer id, String email, String firstname, String lastname, String name, String password_hash,
			Integer active, Integer business_id_lastest, Integer status) {
		super();
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.name = name;
		this.password_hash = password_hash;
		this.active = active;
		this.business_id_lastest = business_id_lastest;
		this.status = status;
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

	// @JsonIgnore
	@Column(name = "password_hash")
	public String getPasswordHash() {
		return password_hash;
	}

	public void setPasswordHash(String password_hash) {
		this.password_hash = password_hash;
	}
	@Column(name = "active")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	@Column(name = "business_id_lastest")
	public Integer getBusiness_id_lastest() {
		return business_id_lastest;
	}

	public void setBusiness_id_lastest(Integer business_id_lastest) {
		this.business_id_lastest = business_id_lastest;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
