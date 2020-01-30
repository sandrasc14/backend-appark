package com.appark.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="usefulness")
public class Usefulness implements Serializable{
  
	@EmbeddedId
	protected UsefulnessPK usefulnessPK;
	
	 private short positive;
	 
    @JoinColumn(name = "review", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Review review;
    
    @JoinColumn(name = "user", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;
    
  
    public Usefulness() {
    }
 
	public UsefulnessPK getUsefulnessPK() {
		return usefulnessPK;
	}

	public void setUsefulnessPK(UsefulnessPK usefulnessPK) {
		this.usefulnessPK = usefulnessPK;
	}

	public short getPositive() {
		return positive;
	}

	public void setPositive(short positive) {
		this.positive = positive;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
