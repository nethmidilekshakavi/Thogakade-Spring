package org.example.controller;

import org.example.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {



    @PostMapping
    public String test1(@RequestParam("id") String id){
        return "Form Data" + id;
    }

    @PostMapping(path = "test2")
    public String test2(@ModelAttribute CustomerDto customerDto){
       // @ModelAttribute meka use kranne hriymtma data tika obj eekat da ganna
        return customerDto.toString();
    }

}


