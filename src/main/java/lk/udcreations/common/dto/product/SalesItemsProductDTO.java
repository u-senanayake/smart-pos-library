package lk.udcreations.common.dto.product;

import java.math.BigDecimal;

public class SalesItemsProductDTO {

	private Integer id;
	private String productId;
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private BigDecimal costPrice;
	private BigDecimal maxDiscount;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public BigDecimal getMaxDiscount() {
		return maxDiscount;
	}

	public void setMaxDiscount(BigDecimal maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	public SalesItemsProductDTO(Integer id, String productId, String sku, String name, String description,
			BigDecimal price, BigDecimal costPrice, BigDecimal maxDiscount) {
		super();
		this.id = id;
		this.productId = productId;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.price = price;
		this.costPrice = costPrice;
		this.maxDiscount = maxDiscount;
	}

}
