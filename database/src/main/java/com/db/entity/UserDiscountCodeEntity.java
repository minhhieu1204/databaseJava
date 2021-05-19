package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_discountcode")
public class UserDiscountCodeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "status")
	private Boolean status;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
	
	@ManyToOne
    @JoinColumn(name = "discountcode_id")
    private DiscountCodeEntity discountCode;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public DiscountCodeEntity getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(DiscountCodeEntity discountCode) {
		this.discountCode = discountCode;
	}

	public Long getId() {
		return id;
	}
	
	

	
	
}