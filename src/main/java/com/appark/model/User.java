package com.appark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="users")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	public Integer id;
	
	@Column(length = 45)
	@Basic(optional = false)
    @NotNull
	private String name;
	
	@Column(name = "surname_1", length = 45)
    @Basic(optional = false)
    @NotNull
    private String surname1;
	
    @Column(name = "surname_2", length = 45)
    private String surname2;
    
    @Column(name = "birth_date")
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @Column(name = "google_user")
    @Basic(optional = false)
    private short googleUser;
    
    @Column(name = "google_id", length = 45)
    private String googleId;
    
    @Column(name = "email", length = 45)
    private String email;
    
    @Column(name = "password", length = 45)
    private String password;
    
    @NotNull
    @Basic(optional = false)
    private short admin;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Usefulness> usefulnessCollection;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "reviewer")
    private List<Review> reviewsCollection;
    
    @JoinColumn(name = "vehicle", referencedColumnName = "id")
    @ManyToOne
    @JsonBackReference
    private Vehicle vehicle;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    protected String googleToken;
    
	public User() {
		this.usefulnessCollection = new ArrayList<>();
		this.reviewsCollection = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname1() {
		return surname1;
	}

	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}

	public String getSurname2() {
		return surname2;
	}

	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public short getGoogleUser() {
		return googleUser;
	}

	public void setGoogleUser(short googleUser) {
		this.googleUser = googleUser;
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getAdmin() {
		return admin;
	}

	public void setAdmin(short admin) {
		this.admin = admin;
	}

	public List<Usefulness> getUsefulnessCollection() {
		return usefulnessCollection;
	}

	public void setUsefulnessCollection(List<Usefulness> usefulnessCollection) {
		this.usefulnessCollection = usefulnessCollection;
	}

	public List<Review> getReviewsCollection() {
		return reviewsCollection;
	}

	public void setReviewsCollection(List<Review> reviewsCollection) {
		this.reviewsCollection = reviewsCollection;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getGoogleToken() {
		return googleToken;
	}

	public void setGoogleToken(String googleToken) {
		this.googleToken = googleToken;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
