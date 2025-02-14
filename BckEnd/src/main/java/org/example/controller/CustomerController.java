package org.example.controller;

import org.example.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    private List<CustomerDto> customers = new ArrayList<>();


    @PostMapping(path = "save")
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto) {
        customers.add(customerDto);
        return customerDto;
    }

    @PutMapping(path = "update")
    public CustomerDto UpdateCustomer(@RequestBody CustomerDto customerDto) {
        for(int i = 0; i < customers.size(); i++){
            CustomerDto existingConfig = customers.get(i);
            if (existingConfig.getId().equals(customerDto.getId())){
                existingConfig.setName(customerDto.getName());
                existingConfig.setAddress(customerDto.getAddress());
                return existingConfig;
            }
        }
        return customerDto;
    }


    @GetMapping(path = "getAll")
    public List<CustomerDto> GetAll() {
       return customers;
    }


    @DeleteMapping(path = "delete/{id}")
    public boolean DeleteCustomer(@PathVariable("id") String id) {
        for(int i = 0; i < customers.size(); i++){
            CustomerDto existingCustomer = customers.get(i);
            if (existingCustomer.getId().equals(id)){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
}
