package org.example.i3_springboot.Controller;

import org.example.i3_springboot.Dto.ItemDto;
import org.example.i3_springboot.service.IMPL.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    public ItemServiceImpl itemService;

    @PostMapping("save")
    public boolean saveItem(@RequestBody ItemDto itemDto){

       boolean response = itemService.saveItem(itemDto);

       return response;

    }

    @GetMapping("getAll")
    public List<ItemDto> getAllItem(){

        List<ItemDto> list = itemService.getAll();

        return list;
    }


    @PutMapping("update")
    public boolean updateItem(@RequestBody String code, ItemDto itemDto){
        boolean response = itemService.updateItem(code,itemDto);
        return response;
    }

    @DeleteMapping("delete")
    public boolean deleteItem(String code){
        itemService.deleteItem(code);
        return true;
    }

}
