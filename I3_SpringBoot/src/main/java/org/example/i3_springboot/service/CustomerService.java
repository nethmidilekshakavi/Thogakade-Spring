package org.example.i3_springboot.service;


import org.example.i3_springboot.Dto.CustomerDto;
import org.example.i3_springboot.Repo.CustomerRepo;
import org.example.i3_springboot.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.yaml.snakeyaml.nodes.NodeId.mapping;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public boolean addCustomer(CustomerDto customerDto){
        if (customerRepo.existsById(customerDto.getId())){
            return false;
        }
       customerRepo.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress()));
        System.out.println("Service Method  " + customerDto.getAddress() );
        //data-save
        return true;
    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }


    public boolean deleteCustomer(Integer id){
        customerRepo.deleteById(id);
        return true;
    }

    public boolean update(CustomerDto customerDto){
        customerRepo.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress()));
        System.out.println("update " + customerDto.getAddress());
        return true;
    }

}
