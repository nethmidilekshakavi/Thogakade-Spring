package org.example.i3_springboot.service;

import org.example.i3_springboot.Dto.ItemDto;
import org.example.i3_springboot.entity.Item;

import java.util.List;

public interface ItemService {

    boolean saveItem(ItemDto itemDto);

    boolean updateItem(String code , ItemDto itemDto);

    void deleteItem(String code);

    List<Item> getAll ();
}
