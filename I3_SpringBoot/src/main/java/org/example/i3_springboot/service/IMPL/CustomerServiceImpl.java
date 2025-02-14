package org.example.i3_springboot.service.IMPL;


import org.example.i3_springboot.Dto.CustomerDto;
import org.example.i3_springboot.Repo.CustomerRepo;
import org.example.i3_springboot.entity.Customer;
import org.example.i3_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public boolean saveCustomer(CustomerDto customerDto) {
        customerRepo.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress()));
        return false;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
    }

    @Override
    public boolean updateCustomer(Integer id, CustomerDto customerDto) {
        customerRepo.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress()));
        return false;
    }

    @Override
    public List<CustomerDto> gellAll() {
        return List.of();
    }
}
