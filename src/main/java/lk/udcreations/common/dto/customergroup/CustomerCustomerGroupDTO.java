package lk.udcreations.common.dto.customergroup;

public class CustomerCustomerGroupDTO {

	private Integer customerGroupId;
	private String name;
	private String description;

	public Integer getCustomerGroupId() {
		return customerGroupId;
	}

	public void setCustomerGroupId(Integer customerGroupId) {
		this.customerGroupId = customerGroupId;
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

	public CustomerCustomerGroupDTO(Integer customerGroupId, String name, String description) {
		super();
		this.customerGroupId = customerGroupId;
		this.name = name;
		this.description = description;
	}

}
