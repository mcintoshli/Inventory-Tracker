package backend.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


@Entity
@Table(name="INVENTORY")
@IdClass(InventoryId.class)
public class Inventory {

	@Id
	private String upcCode;
	@Id
	private BucketStatus bucket;
	
	private int count;
	
	public Inventory() {}
	
	public Inventory(String upcCode, BucketStatus bucket, int count) {
		super();
		this.upcCode = upcCode;
		this.bucket = bucket;
		this.count = count;
	}
		
	public enum BucketStatus {
		InStock,
		Sold,
		Returned
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public BucketStatus getBucket() {
		return bucket;
	}

	public void setBucket(BucketStatus bucket) {
		this.bucket = bucket;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
