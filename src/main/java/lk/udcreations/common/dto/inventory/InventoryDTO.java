package lk.udcreations.common.dto.inventory;

import java.time.LocalDateTime;

public class InventoryDTO {

	private Integer inventoryId;

	private Integer productId;

	private String productStringId;

	private String prductSku;

	private String productName;

	private Integer categoryId;

	private String categoryName;

	private Integer distributorId;

	private String distributorName;

	private Integer quantity;

	private Integer stockAlertLevel;

	private Integer stockWarningLevel;

	private LocalDateTime lastUpdated;


	public Integer getStockAlertLevel() {
		return stockAlertLevel;
	}

	public void setStockAlertLevel(Integer stockAlertLevel) {
		this.stockAlertLevel = stockAlertLevel;
	}

	public Integer getStockWarningLevel() {
		return stockWarningLevel;
	}

	public void setStockWarningLevel(Integer stockWarningLevel) {
		this.stockWarningLevel = stockWarningLevel;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductStringId() {
		return productStringId;
	}

	public void setProductStringId(String productStringId) {
		this.productStringId = productStringId;
	}

	public String getPrductSku() {
		return prductSku;
	}

	public void setPrductSku(String prductSku) {
		this.prductSku = prductSku;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Integer distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}



	public InventoryDTO() {
		super();
	}


}
