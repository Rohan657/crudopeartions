package com.tcs.demo1.controller;
import com.tcs.demo1.Entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.demo1.dao.UserRepo;

import java.util.ArrayList;
@RestController
public class Controller {
	@Autowired
	UserRepo repo;
	@GetMapping("/getallusers")
	public List<User> all_users(){
		return repo.findAll();
	}
	@GetMapping("/getuser/{id}")
	public Optional<User> get_user(@PathVariable("id") int id) {
		return repo.findById(id);
	}
	@PostMapping("/createuser")
	public String create_user(@RequestBody User user) {
	    repo.save(user);
		return "user created";
		
	}
	@DeleteMapping("/deleteuser/{id}")
	public String delete(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "user deleted";
	}
	@PutMapping("/updateuser")
	public String updateuser(@RequestParam String add,@RequestParam Integer id) {
	  User u= repo.findById(id).orElse(null);
	  u.setAddress(add);
	  repo.save(u);
		return "updated";
	
}
}
