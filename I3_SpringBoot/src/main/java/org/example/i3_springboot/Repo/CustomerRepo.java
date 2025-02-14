package org.example.i3_springboot.Repo;

import org.example.i3_springboot.Dto.CustomerDto;
import org.example.i3_springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
