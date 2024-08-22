package backend.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import backend.demo.entity.Inventory;
import backend.demo.entity.Item;
import backend.demo.repository.InventoryRepository;
import backend.demo.repository.ItemRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository invRepo;
	
	public Inventory newItemAdded(Item item) {
		Inventory inventory = invRepo.save(new Inventory(item.getUpcCode(), 100));
		
		return inventory;
	}
	
}
