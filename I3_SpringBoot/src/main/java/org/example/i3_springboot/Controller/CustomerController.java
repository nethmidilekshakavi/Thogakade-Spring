package org.example.i3_springboot.Controller;

import org.example.i3_springboot.Dto.CustomerDto;
import org.example.i3_springboot.entity.Customer;
import org.example.i3_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    //property injection
    @Autowired
    private  CustomerService customerService;

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDto customerDto){
        boolean res = customerService.addCustomer(customerDto);
        return res;

    }

    @GetMapping("getAll")
    public List<Customer> getAllCustomers() {

   List<Customer> list =   customerService.getAllCustomer();

        System.out.println(list);

   return list;

    }

    @DeleteMapping("delete")
    public boolean deleteID(Integer id){

     customerService.deleteCustomer(id);

     return true;
    }

    @PutMapping("update")
    public  boolean updateCustomer(@RequestBody CustomerDto customerDto){
        boolean res = customerService.update(customerDto);
        return res;
    }

}
