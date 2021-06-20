package com.xepenxion.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.hibernate.type.OrderedSetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xepenxion.Service.OrderService;

import beans.Order;
import beans.Product;

public class OrderController {
	@Autowired
	OrderService orderService;

	@GetMapping("/all")
	public List<Order> list() {
		return orderService.listAllOrder();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Order> get(@PathVariable Integer id) {
		try {
			Order o = orderService.getOrder(id);
			return new ResponseEntity<Order>(o, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public void add(@RequestBody Order order) {
		orderService.saveOrder(order);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id) {
		try {
//            Product existProduct = productService.getProduct(id);
			order.setOrderId(id);
			orderService.saveOrder(order);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		orderService.deleteOrder(id);
	}

}
