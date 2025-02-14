package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMappingController {

    @GetMapping(path = "test1/*/hello")
    //start mark eka change wenna puluwan ekat ons ekk danna puluwan
    public String test1(){
        return "get Mapping 1 invoked";
    }

    @GetMapping(path = "test2/*/*")
    //start mark eka change wenna puluwan ekat ons ekk danna puluwan
    public String test2(){
        return "get Mapping 2 invoked";
    }

}
