package org.example.i3_springboot.Repo;

import org.example.i3_springboot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item,String> {
}
