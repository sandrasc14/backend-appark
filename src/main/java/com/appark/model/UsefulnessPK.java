package com.appark.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;


@Embeddable
public class UsefulnessPK implements Serializable {

	@Basic(optional = false)
    @NotNull
    @Column(name = "REVIEW")
    private int review;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER")
    private int user;

    public UsefulnessPK() {
    }

    public UsefulnessPK(int review, int user) {
        this.review = review;
        this.user = user;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) review;
        hash += (int) user;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsefulnessPK)) {
            return false;
        }
        UsefulnessPK other = (UsefulnessPK) object;
        if (this.review != other.review) {
            return false;
        }
        if (this.user != other.user) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UsefulnessPK[ review=" + review + ", user=" + user + " ]";
    }
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
}
