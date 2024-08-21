package backend.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Item entity class containing item details
 * Date: 8/20/2024
 * @author LiamMcIntosh
 */
@Entity
@Table(name="ITEM")
public class Item {

	@Id
	private String upcCode;
	private String name;
	private String description;
	private Double price;
	private Double weight;
	private String shippingSize;
	
	public Item() {}
	
	public Item(String upcCode, String name, String description, Double price, Double weight, String shippingSize) {
		super();
		this.upcCode = upcCode;
		this.name = name;
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.shippingSize = shippingSize;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getShippingSize() {
		return shippingSize;
	}

	public void setShippingSize(String shippingSize) {
		this.shippingSize = shippingSize;
	}
}
