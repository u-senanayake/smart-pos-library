package lk.udcreations.common.dto.returns;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lk.udcreations.common.dto.salesitems.SalesItemDTO;

public class ReturnDTO {

	private Integer returnId;
	private Integer saleId;
	private List<SalesItemDTO> salesItems;
	private int quantity;
	private String reason;
	private BigDecimal refundAmount;
	private LocalDateTime returnDate;

	public Integer getReturnId() {
		return returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public List<SalesItemDTO> getSalesItems() {
		return salesItems;
	}

	public void setSalesItems(List<SalesItemDTO> salesItems) {
		this.salesItems = salesItems;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

}
