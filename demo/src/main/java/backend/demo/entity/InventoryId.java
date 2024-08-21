package backend.demo.entity;

import java.io.Serializable;

import backend.demo.entity.Inventory.BucketStatus;

public class InventoryId implements Serializable{


	private static final long serialVersionUID = -4866705703980053686L;
		
	private String upcCode;
	private BucketStatus bucket;
	
	public InventoryId() {}
	
	public InventoryId(String upcCode, BucketStatus bucket) {
		super();
		this.upcCode = upcCode;
		this.bucket = bucket;
	}
}
