package org.example.i3_springboot.Controller;

import org.example.i3_springboot.Dto.CustomerDto;
import org.example.i3_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    //property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDto customerDto){
        boolean res = customerService.saveCustomer(customerDto);
        return res;

    }

    @GetMapping("getAll")
    public List<CustomerDto> getAllCustomers() {

   List<CustomerDto> list =   customerService.gellAll();

        System.out.println(list);

        return list;

    }

    @DeleteMapping("delete")
    public boolean deleteID(Integer id){

     customerService.deleteCustomer(id);

     return true;
    }

    @PutMapping("update")
    public  boolean updateCustomer(@RequestBody Integer id , CustomerDto customerDto){
        boolean res = customerService.updateCustomer(id,customerDto);
        return res;
    }

}
