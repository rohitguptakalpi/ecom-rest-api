package com.xepenxion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.Order;


public interface OrderRepo extends JpaRepository<Order, Integer> {

}
