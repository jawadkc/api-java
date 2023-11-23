// src/main/java/com.example.crudapi.repository.ItemRepository.java

package com.example.crudapi.repository;

import com.example.crudapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}