package lk.udcreations.common.dto.inventory;

public class StockDTO {

	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public StockDTO(int quantity) {
		super();
		this.quantity = quantity;
	}

	public StockDTO() {
		super();
	}
}
