package lk.udcreations.common.dto.inventory;

import java.time.LocalDateTime;

public class ProductInventoryDTO {

	private Integer inventoryId;

	private Integer quantity;

	private Integer stockAlertLevel;

	private Integer stockWarningLevel;

	private LocalDateTime lastUpdated;


	public Integer getInventoryId() {
		return inventoryId;
	}


	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

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

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}


	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	public ProductInventoryDTO(Integer inventoryId, Integer quantity, Integer stockAlertLevel,
			Integer stockWarningLevel, LocalDateTime lastUpdated) {
		super();
		this.inventoryId = inventoryId;
		this.quantity = quantity;
		this.stockAlertLevel = stockAlertLevel;
		this.stockWarningLevel = stockWarningLevel;
		this.lastUpdated = lastUpdated;
	}


}
