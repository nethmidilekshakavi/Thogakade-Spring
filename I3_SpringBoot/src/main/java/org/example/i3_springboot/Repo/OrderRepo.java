package org.example.i3_springboot.Repo;

import org.example.i3_springboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order , Long> {



}
