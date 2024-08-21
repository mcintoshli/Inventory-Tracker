package backend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.demo.entity.Inventory;
import backend.demo.entity.InventoryId;

public interface InventoryRepository extends JpaRepository<Inventory, InventoryId>{

}
