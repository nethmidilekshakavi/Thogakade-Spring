package org.example.i3_springboot.service;

import org.example.i3_springboot.Repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;


}
