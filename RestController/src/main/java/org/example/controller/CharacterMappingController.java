package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {
    @GetMapping(path = "test1/I???")
    //quection marks pramanayata values denna one mewa serach ekkt use kranna puluwan
    //http://localhost:8080/RestController_Web_exploded/character/test1/Iabc
    public String test1(){
        return "test 1 get Method Invoke";
    }

    @GetMapping(path = "????/test2")
    public String test2(){
        return "test 2 get Method Invoke";
    }

}
