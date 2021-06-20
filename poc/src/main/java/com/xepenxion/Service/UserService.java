package com.xepenxion.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xepenxion.repo.UserRepo;

import beans.User;


@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public List<User> listAllUser(){
		return (List<User>) userRepo.findAll();
	}
	public void saveUser(User user) {
        userRepo.save(user);
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }
	

}
