package co.simplon.hardwareTacticalAPI.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ProductCreateDto {
	 @Size(max = 100)
	    @NotEmpty
	    private String name;
	    @Size(max = 1000)
	    @NotEmpty
	    private String description;
	    @Size(max = 300)
	    @NotEmpty
	    private String imageURL;
	    @NotNull
	    private Long sizeId;
	    @NotNull
	    private Long CategoriesId;
	    @DecimalMax(value = "100.00")
	    @DecimalMin(value = "0.01")
	    @Positive
	    @NotNull
	    private BigDecimal price;

	    public ProductCreateDto() {
		// TODO Auto-generated constructor stub
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

	    public String getImageURL() {
		return imageURL;
	    }

	    public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	    }

	    public Long getSizeId() {
		return sizeId;
	    }

	    public void setSizeId(Long sizeId) {
		this.sizeId = sizeId;
	    }

	    public Long getCategoriesId() {
		return categoriesId;
	    }

	    public void setCategoriesId(Long categoriesId) {
		this.categoriesId = categoriesId;
	    }

	    public BigDecimal getPrice() {
		return price;
	    }

	    public void setPrice(BigDecimal price) {
		this.price = price;
	    }

	    @Override
	    public String toString() {
		return "{name=" + name + ", description="
			+ description + ", imageURL=" + imageURL
			+ ", sizeId=" + sizeId + ", categoriesId="
			+ categoriesId + ", price=" + price + "}";
	    }

}
