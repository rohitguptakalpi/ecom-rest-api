package com.xepenxion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.User;


public interface UserRepo extends JpaRepository<User, Integer>{

}
