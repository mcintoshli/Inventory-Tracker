package backend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.demo.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, String>{

}
