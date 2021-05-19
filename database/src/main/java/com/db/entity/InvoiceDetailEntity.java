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
@Table(name="invoicedetail")
public class InvoiceDetailEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "price")
	private Double price;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "totalprice")
	private Double totalPrice;
	
	@ManyToOne
    @JoinColumn(name = "invoiceentered_id")
    private InvoiceEnteredEntity invoiceEntered;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public InvoiceEnteredEntity getInvoiceEntered() {
		return invoiceEntered;
	}

	public void setInvoiceEntered(InvoiceEnteredEntity invoiceEntered) {
		this.invoiceEntered = invoiceEntered;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public Long getId() {
		return id;
	}
	
	
}
