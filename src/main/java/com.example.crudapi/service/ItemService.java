// src/main/java/com.example.crudapi.service.ItemService.java

package com.example.crudapi.service;

import com.example.crudapi.model.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();

    Item getItemById(Long id);

    Item saveItem(Item item);

    void deleteItem(Long id);
}