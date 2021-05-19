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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "importprice")
	private Double importPrice;
	
	@Column(name = "shortdescription")
	private String shortDescription;
	
	@Column(name = "hits")
	private Integer hits;
	
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
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
	
	@ManyToMany(mappedBy = "favouriteProducts")
    private List<UserEntity> favouriteUsers = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "product_group", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "productgroup_id"))
	private List<ProductGroupEntity> productGroups = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "promotion_id")
    private PromotionEntity promotion;
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<CommentEntity> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<ProductPictureEntity> productPictures = new ArrayList<>();
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<InvoiceDetailEntity> invoiceDetails = new ArrayList<>();
	
	@OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
	private List<BillDetailEntity> billDetails = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(Double importPrice) {
		this.importPrice = importPrice;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<UserEntity> getFavouriteUsers() {
		return favouriteUsers;
	}

	public void setFavouriteUsers(List<UserEntity> favouriteUsers) {
		this.favouriteUsers = favouriteUsers;
	}

	public List<ProductGroupEntity> getProductGroups() {
		return productGroups;
	}

	public void setProductGroups(List<ProductGroupEntity> productGroups) {
		this.productGroups = productGroups;
	}

	public PromotionEntity getPromotion() {
		return promotion;
	}

	public void setPromotion(PromotionEntity promotion) {
		this.promotion = promotion;
	}

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	public List<ProductPictureEntity> getProductPictures() {
		return productPictures;
	}

	public void setProductPictures(List<ProductPictureEntity> productPictures) {
		this.productPictures = productPictures;
	}

	public List<InvoiceDetailEntity> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetailEntity> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public List<BillDetailEntity> getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(List<BillDetailEntity> billDetails) {
		this.billDetails = billDetails;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}
	
	
}

























