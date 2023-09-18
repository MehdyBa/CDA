package co.simplon.hardwareTacticalAPI.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "description")
	    private String description;
	    @Column(name = "image_URL")
	    private String imageURL;
	    @JoinColumn(name = "size_id")
	    @ManyToOne
	    private Size size;
	    @JoinColumn(name = "categories_id")
	    @ManyToOne
	    private Categories categories;
	    @Column(name = "price")
	    private BigDecimal price;
	    @Column(name = "created_at")
	    private LocalDate createdAt;

	    public Product() {
		// TODO Auto-generated constructor stub
	    }

	    public Long getId() {
		return id;
	    }

	    public void setId(Long id) {
		this.id = id;
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

	    public Size getSize() {
		return size;
	    }

	    public void setSize(Size size) {
		this.size = size;
	    }

	    public Categories getCategories() {
		return categories;
	    }

	    public void setCategories(Categories categories) {
		this.categories = categories;
	    }

	    public BigDecimal getPrice() {
		return price;
	    }

	    public void setPrice(BigDecimal price) {
		this.price = price;
	    }

	    public LocalDate getCreatedAt() {
		return createdAt;
	    }

	    public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	    }

	    @Override
	    public String toString() {
		return "{id=" + id + ", name=" + name
			+ ", description=" + description
			+ ", imageURL=" + imageURL + ", size="
			+ size + ", aspect=" + categories + ", price="
			+ price + ", createdAt=" + createdAt + "}";
	    }

}
