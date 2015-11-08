package app.services;

import app.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    Item getElementByName(String name);

    void addOrUpdateItem(Item item);

    List<Item> getAllItems();
}
