package lk.udcreations.common.dto.sale;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lk.udcreations.common.dto.customer.CustomerDTO;
import lk.udcreations.common.dto.payment.SalePaymentDTO;
import lk.udcreations.common.dto.salesitems.SalesItemDTO;
import lk.udcreations.common.dto.user.CreatedUpdatedUserDTO;

public class SaleDTO {

	private Integer saleId;
	private CreatedUpdatedUserDTO createdUser;
//	private SaleCustomerDTO customer;
	private CustomerDTO customer;

	private BigDecimal totalAmount;
	private int totalItemCount;
	private LocalDateTime saleDateTime;
	private String paymentStatus;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	private List<SalesItemDTO> salesItems;

	private SalePaymentDTO payment;

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public CreatedUpdatedUserDTO getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(CreatedUpdatedUserDTO createdUser) {
		this.createdUser = createdUser;
	}

//	public SaleCustomerDTO getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(SaleCustomerDTO customer) {
//		this.customer = customer;
//	}


	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
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

	public LocalDateTime getSaleDateTime() {
		return saleDateTime;
	}

	public void setSaleDateTime(LocalDateTime saleDateTime) {
		this.saleDateTime = saleDateTime;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<SalesItemDTO> getSalesItems() {
		return salesItems;
	}

	public void setSalesItems(List<SalesItemDTO> salesItems) {
		this.salesItems = salesItems;
	}

	public SalePaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(SalePaymentDTO payment) {
		this.payment = payment;
	}



}
