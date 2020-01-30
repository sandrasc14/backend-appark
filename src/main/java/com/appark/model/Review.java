package com.appark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review implements Serializable {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String text;

	private Integer score;

	private Integer usefulness;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "review") 
	private List<Usefulness> usefulnessCollection;
	
	@JoinColumn(name = "parking", referencedColumnName = "id")
	@ManyToOne
	private Parking parking;

	@OneToMany(fetch = FetchType.LAZY ,mappedBy = "review")
	private List<Review> reviewsCollection;
 
	@JoinColumn(name = "review", referencedColumnName = "id")
    @ManyToOne
	private Review review;

	@JoinColumn(name = "reviewer", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private User reviewer;
	
	public Review() {
		this.usefulnessCollection = new ArrayList<>();
		this.reviewsCollection = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getUsefulness() {
		return usefulness;
	}

	public void setUsefulness(Integer usefulness) {
		this.usefulness = usefulness;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public List<Review> getReviewsCollection() {
		return reviewsCollection;
	}

	public void setReviewsCollection(List<Review> reviewsCollection) {
		this.reviewsCollection = reviewsCollection;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public List<Usefulness> getUsefulnessCollection() {
		return usefulnessCollection;
	}
	
	public void setUsefulnessCollection(List<Usefulness> usefulnessCollection) {
		this.usefulnessCollection = usefulnessCollection;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
