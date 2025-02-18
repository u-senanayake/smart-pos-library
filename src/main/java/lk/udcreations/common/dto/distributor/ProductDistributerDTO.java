package lk.udcreations.common.dto.distributor;

public class ProductDistributerDTO {

	private Integer distributorId;
	private String name;
	private String email;
	private String phoneNo1;
	private String phoneNo2;
	private String address;

	public Integer getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Integer distributorId) {
		this.distributorId = distributorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ProductDistributerDTO(Integer distributorId, String name, String email, String phoneNo1, String phoneNo2,
			String address) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.email = email;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.address = address;
	}

}
