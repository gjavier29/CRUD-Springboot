package com.javi.crudspring.service;

import com.javi.crudspring.model.Item;
import com.javi.crudspring.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getItemList(){
        return itemRepository.findAll();
    }
}
