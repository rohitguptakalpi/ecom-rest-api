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

import com.xepenxion.Service.UserService;

import beans.User;

public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/all")
	public List<User> list() {
		return userService.listAllUser();
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id) {
		try {
			User user = userService.getUser(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public void add(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
		try {
//            User existUser = UserService.getUser(id);
			user.setUserId(id);
			userService.saveUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		userService.deleteUser(id);
	}

}
