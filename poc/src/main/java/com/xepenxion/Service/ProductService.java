package com.xepenxion.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xepenxion.repo.ProductRepo;

import beans.Product;
@Service
//@Transactional
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> listAllProduct(){
		return productRepo.findAll();
	}
	
	public void saveProduct(Product product) {
        productRepo.save(product);
    }

    public Product getProduct(Integer id) {
        return productRepo.findById(id).get();
    }

    public void deleteProduct(Integer id) {
        productRepo.deleteById(id);
    }
	
}
