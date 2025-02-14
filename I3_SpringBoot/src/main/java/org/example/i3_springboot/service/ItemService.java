package org.example.i3_springboot.service;

import org.example.i3_springboot.Dto.ItemDto;

import java.util.List;

public interface ItemService {

    boolean saveItem(ItemDto itemDto);

    boolean updateItem(String code , ItemDto itemDto);

    void deleteItem(String code);

    List<ItemDto> getAll ();
}
