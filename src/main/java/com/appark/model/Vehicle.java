package com.appark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table; 

@Entity
@Table(name = "vehicles")
public class Vehicle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length=45)
	private String type;

	@ManyToMany(mappedBy="vehiclesCollection")
	private List<Parking> parkingsCollection;
	
	@OneToMany(fetch = FetchType.LAZY ,mappedBy = "vehicle")
	private List<User> usersCollection;
	
    
	public Vehicle() {
		this.parkingsCollection = new ArrayList<>();
		this.usersCollection = new ArrayList<>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Parking> getParkingsCollection() {
		return parkingsCollection;
	}

	public void setParkingsCollection(List<Parking> parkingsCollection) {
		this.parkingsCollection = parkingsCollection;
	}

	public List<User> getUsersCollection() {
		return usersCollection;
	}

	public void setUsersCollection(List<User> usersCollection) {
		this.usersCollection = usersCollection;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
