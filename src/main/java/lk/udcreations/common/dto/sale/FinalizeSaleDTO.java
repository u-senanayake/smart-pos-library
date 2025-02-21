package lk.udcreations.common.dto.sale;

import java.math.BigDecimal;

import lk.udcreations.common.dto.payment.PaymentDTO;

public class FinalizeSaleDTO {

	private Integer customerId;
	private BigDecimal totalAmount;
	private int totalItemCount;
	private PaymentDTO payment;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
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
	public PaymentDTO getPayment() {
		return payment;
	}
	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}

	

}
