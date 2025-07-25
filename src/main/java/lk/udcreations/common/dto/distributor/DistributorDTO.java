package lk.udcreations.common.dto.distributor;

import java.time.LocalDateTime;

import lk.udcreations.common.dto.file.ImageDTO;
import lk.udcreations.common.dto.user.CreatedUpdatedUserDTO;

public class DistributorDTO {

	private Integer distributorId;
	private String companyName;
	private String email;
	private String phoneNo1;
	private String phoneNo2;
	private String address;
	private boolean enabled;
	private boolean deleted;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;

	private ImageDTO image;;

	private CreatedUpdatedUserDTO createdUser;
	private CreatedUpdatedUserDTO updatedUser;
	private CreatedUpdatedUserDTO deletedUser;
	public Integer getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(Integer distributorId) {
		this.distributorId = distributorId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}
}
