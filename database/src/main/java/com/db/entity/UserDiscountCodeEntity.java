package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Embeddable
@Entity
@Table(name="user_discountcode")
public class UserDiscountCodeEntity {
	
	@EmbeddedId
    private UserDiscountCodeId userDiscountCodeId;
	
	@Column(name = "status")
	private Boolean status;
	
	@ManyToOne
    @MapsId("userId")
    private UserEntity user;
	
	@ManyToOne
	@MapsId("discountCodeId")
    private DiscountCodeEntity discountCode;

	public UserDiscountCodeId getUserDiscountCodeId() {
		return userDiscountCodeId;
	}

	public void setUserDiscountCodeId(UserDiscountCodeId userDiscountCodeId) {
		this.userDiscountCodeId = userDiscountCodeId;
	}

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

	
	
	
}
