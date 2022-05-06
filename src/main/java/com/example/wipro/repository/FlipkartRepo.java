package com.example.wipro.repository;

import com.example.wipro.model.Flipkart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlipkartRepo extends JpaRepository<Flipkart,Integer> {
}
