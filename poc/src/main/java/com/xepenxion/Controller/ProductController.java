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

import com.xepenxion.Service.ProductService;
import com.xepenxion.repo.ProductRepo;

import beans.Product;

@RestController
@RequestMapping("/Products")
public class ProductController {
	@Autowired
    ProductService productService;
	
	@GetMapping("/all")
    public List<Product> list() {
        return productService.listAllProduct();
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        try {
            Product Product = productService.getProduct(id);
            return new ResponseEntity<Product>(Product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/add")
    public void add(@RequestBody Product product) {
        productService.saveProduct(product);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
        try {
//            Product existProduct = productService.getProduct(id);
            product.setProductId(id);            
            productService.saveProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
	
	

}
