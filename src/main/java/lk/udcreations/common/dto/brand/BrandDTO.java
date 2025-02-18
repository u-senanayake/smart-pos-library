package lk.udcreations.common.dto.brand;

import java.time.LocalDateTime;

import lk.udcreations.common.dto.user.CreatedUpdatedUserDTO;

public class BrandDTO {

	private Integer brandId;
	private String name;
	private String description;
	private boolean enabled;
	private boolean deleted;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private LocalDateTime deletedAt;

	private CreatedUpdatedUserDTO createdUser;
	private CreatedUpdatedUserDTO updatedUser;
	private CreatedUpdatedUserDTO deletedUser;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
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



}
