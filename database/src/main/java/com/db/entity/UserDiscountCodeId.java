package com.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class UserDiscountCodeId implements Serializable {

	@Column(name = "user_id")
    private Long userId;
 
    @Column(name = "discountcode_id")
    private Long discountCodeId;
}
