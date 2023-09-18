package co.simplon.hardwareTacticalAPI.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "categories")
	public class Categories {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;
	    @Column(name = "name", updatable = false)
	    private String name;

	    public Categories() {
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

	    @Override
	    public String toString() {
		return "{id=" + id + ", name=" + name + "}";
	    }

}
