package backend.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import backend.demo.entity.Item;
import backend.demo.repository.ItemRepository;

@Service
public class InventoryService {

	@Autowired
	private ItemRepository itemRepo;
	
	
	/**
	 * Attempts to save an item to the db
	 * Date: 8/20/2024
	 * @author LiamMcIntosh
	 * @param item
	 * @return
	 */
	public void saveItem(Item item) {
		itemRepo.save(item);
	}

	/**
	 * Attempts to get an item from the db
	 * Date: 8/20/2024
	 * @author LiamMcIntosh
	 * @param upcCode
	 * @return item
	 */
	public Item getItemDetails(String upcCode) throws NotFoundException {
		Optional<Item> item = itemRepo.findById(upcCode);
		
		if(item.isPresent())
			return item.get();
		
		throw new NotFoundException();
	}
	
}
