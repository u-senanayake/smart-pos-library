package lk.udcreations.common.dto.returns;

public class CreateReturnDTO {

	private Integer saleId;
	private Integer salesItemId;
	private int quantity;
	private String reason;

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public Integer getSalesItemId() {
		return salesItemId;
	}

	public void setSalesItemId(Integer salesItemId) {
		this.salesItemId = salesItemId;
	}

	public int getQuantity() {
		return quantity;
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

}
