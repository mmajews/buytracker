package app.services;

import app.model.Item;
import app.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getElementByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public void addOrUpdateItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public ItemServiceImpl() {
    }
}
