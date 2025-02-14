package org.example.i3_springboot.service.IMPL;
import jakarta.transaction.Transactional;
import org.example.i3_springboot.Dto.ItemDto;
import org.example.i3_springboot.Repo.ItemRepo;
import org.example.i3_springboot.entity.Item;
import org.example.i3_springboot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    public ItemRepo itemRepo;

    @Override
    public boolean saveItem(ItemDto itemDto) {
        itemRepo.save(new Item(itemDto.getCode(),itemDto.getName(),itemDto.getPrice(),itemDto.getQty()));
        return true;
    }

    @Override
    public boolean updateItem(String code, ItemDto itemDto) {
        itemRepo.save(new Item(itemDto.getCode(),itemDto.getName(),itemDto.getPrice(),itemDto.getQty()));
        return true;
    }

    @Override
    public void deleteItem(String code) {
        itemRepo.deleteById(code);
    }

    @Override
    public List<ItemDto> getAll() {
        return List.of();
    }
}
