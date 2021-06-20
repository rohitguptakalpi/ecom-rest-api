package com.xepenxion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



import com.xepenxion.repo.OrderRepo;

import beans.Order;

public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	public List<Order> listAllOrder(){
		return orderRepo.findAll();
	}
	
	public void saveOrder(Order order) {
        orderRepo.save(order);
    }

    public Order getOrder(Integer id) {
        return orderRepo.findById(id).get();
    }

    public void deleteOrder(Integer id) {
        orderRepo.deleteById(id);
    }
	

}
