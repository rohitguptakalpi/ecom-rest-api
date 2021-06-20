package com.xepenxion.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xepenxion.repo.DiscountRepo;

import beans.Discount;

@Service
@Transactional
public class DiscountService {
	
	@Autowired
	private DiscountRepo discountRepo;
	
	public List<Discount> listAllDiscount(){
		return discountRepo.findAll();
	}
	
	public void saveDiscount(Discount discount) {
        discountRepo.save(discount);
    }

    public Discount getDiscount(Integer id) {
        return discountRepo.findById(id).get();
    }

    public void deleteDiscount(Integer id) {
        discountRepo.deleteById(id);
    }
	
	
	

}
