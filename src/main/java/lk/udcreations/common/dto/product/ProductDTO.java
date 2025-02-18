package lk.udcreations.common.dto.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lk.udcreations.common.dto.category.ProductCategoryDTO;
import lk.udcreations.common.dto.distributor.ProductDistributerDTO;
import lk.udcreations.common.dto.inventory.ProductInventoryDTO;
import lk.udcreations.common.dto.user.CreatedUpdatedUserDTO;

public class ProductDTO {

	private Integer id;
	private String productId;
	private String sku;
	private String productName;
	private String description;

	private ProductCategoryDTO category;
	private ProductDistributerDTO distributor;
	private ProductInventoryDTO inventory;

	private BigDecimal price;
	private BigDecimal costPrice;
	private BigDecimal minPrice;
	private LocalDate manufactureDate;
	private LocalDate expireDate;
	private boolean enabled;
	private boolean deleted;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;

	private CreatedUpdatedUserDTO createdUser;
	private CreatedUpdatedUserDTO updatedUser;
	private CreatedUpdatedUserDTO deletedUser;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductCategoryDTO getCategory() {
		return category;
	}
	public void setCategory(ProductCategoryDTO category) {
		this.category = category;
	}

	public ProductDistributerDTO getDistributor() {
		return distributor;
	}

	public void setDistributor(ProductDistributerDTO distributor) {
		this.distributor = distributor;
	}
	public ProductInventoryDTO getInventory() {
		return inventory;
	}
	public void setInventory(ProductInventoryDTO inventory) {
		this.inventory = inventory;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	public CreatedUpdatedUserDTO getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(CreatedUpdatedUserDTO createdUser) {
		this.createdUser = createdUser;
	}
	public CreatedUpdatedUserDTO getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(CreatedUpdatedUserDTO updatedUser) {
		this.updatedUser = updatedUser;
	}
	public CreatedUpdatedUserDTO getDeletedUser() {
		return deletedUser;
	}
	public void setDeletedUser(CreatedUpdatedUserDTO deletedUser) {
		this.deletedUser = deletedUser;
	}
}