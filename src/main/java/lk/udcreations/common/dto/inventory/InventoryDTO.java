package lk.udcreations.common.dto.inventory;

import java.time.LocalDateTime;

import lk.udcreations.common.dto.product.ProductDTO;

public class InventoryDTO {

	private Integer inventoryId;

	private ProductDTO product;

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

	public Integer getQuantity() {
		return quantity;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
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
