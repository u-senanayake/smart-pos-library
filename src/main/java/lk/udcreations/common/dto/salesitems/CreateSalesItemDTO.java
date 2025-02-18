package lk.udcreations.common.dto.salesitems;

import java.math.BigDecimal;

public class CreateSalesItemDTO {

	private Integer saleId;
	private Integer productId;
	private int quantity;
	private BigDecimal pricePerUnit;
	private BigDecimal itemDiscountVal;
	private int itemDiscountPer;
	private BigDecimal totalPrice;

	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public BigDecimal getItemDiscountVal() {
		return itemDiscountVal;
	}
	public void setItemDiscountVal(BigDecimal itemDiscountVal) {
		this.itemDiscountVal = itemDiscountVal;
	}
	public int getItemDiscountPer() {
		return itemDiscountPer;
	}
	public void setItemDiscountPer(int itemDiscountPer) {
		this.itemDiscountPer = itemDiscountPer;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}


}
