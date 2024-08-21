package backend.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.demo.entity.Item;
import backend.demo.services.InventoryService;
import backend.demo.services.ItemService;

/**
 * Date: 8/19/2024
 * @author LiamMcIntosh
 * Inventory Controller to manage inventory
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private ItemService itemServ;
	
	
	/**
	 * Attempts to save an item to the db
	 * Date: 8/19/2024
	 * @author LiamMcIntosh
	 * @param item
	 * @return
	 */
	@PostMapping("/addItem")
	public ResponseEntity<?> addNewItem(@RequestBody Item item){
		try {
			itemServ.saveItem(item);
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
		return ResponseEntity.ok().build();
	}
	
	
	/**
	 * Attempts to grab the item details based off of a upc scan
	 * Date: 8/20/2024
	 * @author LiamMcIntosh
	 * @param upcCode
	 * @return item
	 */
	@GetMapping("/getItemDetails")
	public ResponseEntity<Item> getItemDetails(@RequestParam String upcCode){
		try {
			return ResponseEntity.ok(itemServ.getItemDetails(upcCode));
		} catch (NotFoundException nf) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
		
	}
}
