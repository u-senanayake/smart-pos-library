package lk.udcreations.common.dto.payment;

import java.math.BigDecimal;

public class SalePaymentDTO {

	private Integer paymentId;
	private Integer saleId;
	private BigDecimal cashAmount;
	private BigDecimal cCardAmount;
	private String cCardRef;
	private BigDecimal qrAmount;
	private String qrRef;
	private BigDecimal chequeAmount;
	private String chequeRef;
	private BigDecimal dueAmount;

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public BigDecimal getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BigDecimal getcCardAmount() {
		return cCardAmount;
	}

	public void setcCardAmount(BigDecimal cCardAmount) {
		this.cCardAmount = cCardAmount;
	}

	public String getcCardRef() {
		return cCardRef;
	}

	public void setcCardRef(String cCardRef) {
		this.cCardRef = cCardRef;
	}

	public BigDecimal getQrAmount() {
		return qrAmount;
	}

	public void setQrAmount(BigDecimal qrAmount) {
		this.qrAmount = qrAmount;
	}

	public String getQrRef() {
		return qrRef;
	}

	public void setQrRef(String qrRef) {
		this.qrRef = qrRef;
	}

	public BigDecimal getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(BigDecimal chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public String getChequeRef() {
		return chequeRef;
	}

	public void setChequeRef(String chequeRef) {
		this.chequeRef = chequeRef;
	}

	public BigDecimal getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
	}

	public SalePaymentDTO(Integer paymentId, Integer saleId, BigDecimal cashAmount, BigDecimal cCardAmount,
			String cCardRef, BigDecimal qrAmount, String qrRef, BigDecimal chequeAmount, String chequeRef,
			BigDecimal dueAmount) {
		super();
		this.paymentId = paymentId;
		this.saleId = saleId;
		this.cashAmount = cashAmount;
		this.cCardAmount = cCardAmount;
		this.cCardRef = cCardRef;
		this.qrAmount = qrAmount;
		this.qrRef = qrRef;
		this.chequeAmount = chequeAmount;
		this.chequeRef = chequeRef;
		this.dueAmount = dueAmount;
	}

}
