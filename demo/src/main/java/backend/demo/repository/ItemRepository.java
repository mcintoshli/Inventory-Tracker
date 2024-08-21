package backend.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.demo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String>{

}
