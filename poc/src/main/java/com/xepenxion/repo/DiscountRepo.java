package com.xepenxion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.Discount;

public interface DiscountRepo extends JpaRepository<Discount, Integer>{

}
