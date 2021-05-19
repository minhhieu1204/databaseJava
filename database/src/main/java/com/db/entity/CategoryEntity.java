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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "image")
	private String image;

	@Column(name = "delete")
	private Boolean delete;
	
	@Column(name = "createdate")
	private Date createDate;
	
	@Column(name = "modifieddate")
	private Date modifiedDate;

	@Column(name = "createby")
	private String createBy;

	@Column(name = "modifiedby")
	private String modifiedBy;
	
	@OneToMany(mappedBy = "category", fetch=FetchType.LAZY)
	private List<CategoryEntity> catogories = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
	
	@OneToMany(mappedBy = "category", fetch=FetchType.LAZY)
	private List<ProductEntity> products = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getDelete() {
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public List<CategoryEntity> getCatogories() {
		return catogories;
	}

	public void setCatogories(List<CategoryEntity> catogories) {
		this.catogories = catogories;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	
}
