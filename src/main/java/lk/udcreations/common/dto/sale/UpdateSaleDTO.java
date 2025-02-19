package lk.udcreations.common.dto.sale;

import java.math.BigDecimal;

public class UpdateSaleDTO {

	private BigDecimal totalAmount;
	private int totalItemCount;
	private String paymentStatus;
	private Integer customerId;

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalItemCount() {
		return totalItemCount;
	}

	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
