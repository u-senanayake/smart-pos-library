package lk.udcreations.common.dto.salesitems;

import java.math.BigDecimal;

import lk.udcreations.common.dto.product.SalesItemsProductDTO;

public class SalesItemDTO {

	private Integer salesItemId;
	private Integer saleId;
	private SalesItemsProductDTO product;
	private int quantity;
	private int returnedQuantity;
	private BigDecimal pricePerunit;
	private BigDecimal itemDiscountVal;
	private int itemDiscountPer;
	private BigDecimal totalPrice;

	public Integer getSalesItemId() {
		return salesItemId;
	}
	public void setSalesItemId(Integer salesItemId) {
		this.salesItemId = salesItemId;
	}
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public SalesItemsProductDTO getProduct() {
		return product;
	}

	public void setProduct(SalesItemsProductDTO product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPricePerunit() {
		return pricePerunit;
	}
	public void setPricePerunit(BigDecimal pricePerunit) {
		this.pricePerunit = pricePerunit;
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

	public int getReturnedQuantity() {
		return returnedQuantity;
	}

	public void setReturnedQuantity(int returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}




}
