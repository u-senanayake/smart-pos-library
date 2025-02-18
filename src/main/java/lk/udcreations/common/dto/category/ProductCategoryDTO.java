package lk.udcreations.common.dto.category;

public class ProductCategoryDTO {

	private Integer categoryId;
	private String name;
	private String description;
	private String prefix;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public ProductCategoryDTO(Integer categoryId, String name, String description, String prefix) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.prefix = prefix;
	}

}
