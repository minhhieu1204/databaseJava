package com.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "username", unique = true)
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "fullname")
	private String fullName;

	@Column(name = "avatar")
	private String avatar;

	@Column(name = "birthday")
	private Date birthDay;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	@Column
	private Integer status;

	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<RoleEntity> roles = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "favourite", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductEntity> favouriteProducts = new ArrayList<>();


	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<InvoiceEnteredEntity> invoiceEntereds = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<BillEntity> bills = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<CommentEntity> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<CategoryEntity> categories = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<ProductEntity> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<PromotionEntity> promotions = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<DiscountCodeEntity> discountCodes = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<UserDiscountCodeEntity> userDiscountCodes = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch=FetchType.LAZY)
	private List<ProductGroupEntity> productGroups = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public List<ProductEntity> getFavouriteProducts() {
		return favouriteProducts;
	}

	public void setFavouriteProducts(List<ProductEntity> favouriteProducts) {
		this.favouriteProducts = favouriteProducts;
	}

	public List<InvoiceEnteredEntity> getInvoiceEntereds() {
		return invoiceEntereds;
	}

	public void setInvoiceEntereds(List<InvoiceEnteredEntity> invoiceEntereds) {
		this.invoiceEntereds = invoiceEntereds;
	}

	public List<BillEntity> getBills() {
		return bills;
	}

	public void setBills(List<BillEntity> bills) {
		this.bills = bills;
	}

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	public List<CategoryEntity> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryEntity> categories) {
		this.categories = categories;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public List<PromotionEntity> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<PromotionEntity> promotions) {
		this.promotions = promotions;
	}

	public List<DiscountCodeEntity> getDiscountCodes() {
		return discountCodes;
	}

	public void setDiscountCodes(List<DiscountCodeEntity> discountCodes) {
		this.discountCodes = discountCodes;
	}

	public List<UserDiscountCodeEntity> getUserDiscountCodes() {
		return userDiscountCodes;
	}

	public void setUserDiscountCodes(List<UserDiscountCodeEntity> userDiscountCodes) {
		this.userDiscountCodes = userDiscountCodes;
	}

	public List<ProductGroupEntity> getProductGroups() {
		return productGroups;
	}

	public void setProductGroups(List<ProductGroupEntity> productGroups) {
		this.productGroups = productGroups;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
}
