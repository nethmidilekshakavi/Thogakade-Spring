package org.example.controller;

import org.example.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public  String test1(@RequestBody CustomerDto customerDto){
        return customerDto.toString();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto test2(){
        return new CustomerDto("asdsd","sdsd","DFFG");

    }
    @GetMapping(path = "getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDto> test3(){
        ArrayList<CustomerDto> list = new ArrayList<>();
        list.add(new CustomerDto("10","A","FDG"));
        list.add(new CustomerDto("11","B","GG"));
        list.add(new CustomerDto("12","C","FDG"));
        return list;
}

}
