package lk.udcreations.common.dto.product;

import java.math.BigDecimal;

import lk.udcreations.common.dto.category.CategoryDTO;
import lk.udcreations.common.dto.distributor.DistributorDTO;


public class CreateProductDTO {

	private String productName;
	private String description;
	private String sku;
	private CategoryDTO category;
	private DistributorDTO distributor;
	private BigDecimal price;
	private BigDecimal costPrice;
	private BigDecimal minPrice;
	private Integer stockWarningLevel;
	private Integer stockAlertLevel;
	private String manufactureDate;
	private String expireDate;
	private boolean enabled;
	private Integer initialStock;


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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public DistributorDTO getDistributor() {
		return distributor;
	}

	public void setDistributor(DistributorDTO distributor) {
		this.distributor = distributor;
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

	public Integer getStockWarningLevel() {
		return stockWarningLevel;
	}

	public void setStockWarningLevel(Integer stockWarningLevel) {
		this.stockWarningLevel = stockWarningLevel;
	}

	public Integer getStockAlertLevel() {
		return stockAlertLevel;
	}

	public void setStockAlertLevel(Integer stockAlertLevel) {
		this.stockAlertLevel = stockAlertLevel;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getInitialStock() {
		return initialStock;
	}

	public void setInitialStock(Integer initialStock) {
		this.initialStock = initialStock;
	}


	@Override
	public String toString() {
		return "CreateProductDTO [productName=" + productName + ", description=" + description + ", sku=" + sku
				+ ", category=" + category + ", distributor=" + distributor + ", price=" + price + ", costPrice="
				+ costPrice + ", minPrice=" + minPrice + ", stockWarningLevel=" + stockWarningLevel
				+ ", stockAlertLevel=" + stockAlertLevel + ", manufactureDate=" + manufactureDate + ", expireDate="
				+ expireDate + ", enabled=" + enabled + ", initialStock=" + initialStock + "]";
	}





}
