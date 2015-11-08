package app.controllers;

import app.model.Item;
import app.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "item/{name}", method = RequestMethod.GET)
    public Item getItemByName(@RequestParam(value = "name") String name) {
        return itemService.getElementByName(name);
    }

    @RequestMapping(value = "items", method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(value = "item", method = RequestMethod.PUT)
    public void addOrUpdateItem(@RequestBody Item item) {
        itemService.addOrUpdateItem(item);
    }
}
