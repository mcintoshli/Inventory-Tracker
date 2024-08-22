package backend.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="INVENTORY")
public class Inventory {

	@Id
	private String upcCode;
	private int stockCount;
	private int returnedCount;
		
	public Inventory() {}
	
	public Inventory(String upcCode, int stockCount) {
		super();
		this.upcCode = upcCode;
		this.stockCount = stockCount;
		this.returnedCount = 0;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getReturnedCount() {
		return returnedCount;
	}

	public void setReturnedCount(int returnedCount) {
		this.returnedCount = returnedCount;
	}

	
}
