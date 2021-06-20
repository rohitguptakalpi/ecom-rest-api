package com.xepenxion.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xepenxion.Service.DiscountService;

import beans.Discount;

@RestController
@RequestMapping("/Discount")
public class DiscountController {
	@Autowired
	DiscountService discountService;

	@GetMapping("/all")
	public List<Discount> list() {
		return discountService.listAllDiscount();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Discount> get(@PathVariable Integer id) {
		try {
			Discount discount = discountService.getDiscount(id);
			return new ResponseEntity<Discount>(discount, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Discount>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public void add(@RequestBody Discount d) {
		discountService.saveDiscount(d);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Discount discount, @PathVariable Integer id) {
		try {
//        Product existProduct = productService.getProduct(id);
			discount.setDiscountId(id);
			discountService.saveDiscount(discount);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		discountService.deleteDiscount(id);
	}
}
