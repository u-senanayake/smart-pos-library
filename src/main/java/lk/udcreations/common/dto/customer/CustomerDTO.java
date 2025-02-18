package lk.udcreations.common.dto.customer;

import java.time.LocalDateTime;

import lk.udcreations.common.dto.customergroup.CustomerCustomerGroupDTO;
import lk.udcreations.common.dto.user.CreatedUpdatedUserDTO;

public class CustomerDTO {

	private CustomerCustomerGroupDTO customerGroup;

	private Integer customerId;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo1;
	private String address;
	private boolean enabled = true;
	private boolean locked = false;
	private boolean deleted = false;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;

	private CreatedUpdatedUserDTO createdUser;
	private CreatedUpdatedUserDTO updatedUser;
	private CreatedUpdatedUserDTO deletedUser;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public CustomerCustomerGroupDTO getCustomerGroup() {
		return customerGroup;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setCustomerGroup(CustomerCustomerGroupDTO customerGroup) {
		this.customerGroup = customerGroup;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	public CreatedUpdatedUserDTO getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(CreatedUpdatedUserDTO createdUser) {
		this.createdUser = createdUser;
	}
	public CreatedUpdatedUserDTO getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(CreatedUpdatedUserDTO updatedUser) {
		this.updatedUser = updatedUser;
	}
	public CreatedUpdatedUserDTO getDeletedUser() {
		return deletedUser;
	}
	public void setDeletedUser(CreatedUpdatedUserDTO deletedUser) {
		this.deletedUser = deletedUser;
	}

	public CustomerDTO(CustomerCustomerGroupDTO customerGroup, Integer customerId, String username, String firstName,
			String lastName, String email, String phoneNo1, String address, boolean enabled, boolean locked,
			boolean deleted, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt,
			CreatedUpdatedUserDTO createdUser, CreatedUpdatedUserDTO updatedUser, CreatedUpdatedUserDTO deletedUser) {
		super();
		this.customerGroup = customerGroup;
		this.customerId = customerId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo1 = phoneNo1;
		this.address = address;
		this.enabled = enabled;
		this.locked = locked;
		this.deleted = deleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.createdUser = createdUser;
		this.updatedUser = updatedUser;
		this.deletedUser = deletedUser;
	}

	public CustomerDTO() {
		super();
	}


}
