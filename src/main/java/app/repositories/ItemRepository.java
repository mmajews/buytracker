package app.repositories;

import app.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
    Item findByName(String name);
}
