package org.example.i3_springboot.service;

import org.example.i3_springboot.Dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    boolean saveCustomer(CustomerDto customerDto);

    void deleteCustomer(Integer id);

    boolean updateCustomer(Integer id, CustomerDto customerDto);

    List<CustomerDto> gellAll();


}
