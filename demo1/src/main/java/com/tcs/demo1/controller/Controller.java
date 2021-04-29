package com.tcs.demo1.controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Controller {
	@Autowired
	 private Service service;
	@GetMapping("/getallusers")
	public ArrayList<User> all_users(){
		return service.getAllUsers();
	}
	@GetMapping("/getuser/{id}")
	public User get_user(@PathVariable("id") int id) {
		return service.getUser(id);
	}
	@PostMapping("/createuser")
	public String add_user(@RequestBody User user) {
		service.addUser(user);
		return "user created";
		
	}
	@DeleteMapping("/deleteuser/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteUser(id);
		return "user deleted";
	}
	@PutMapping("/updateuser/{id}")
	public String updateuser(@RequestBody String add,@PathVariable int id) {
		service.updateUser(add,id);
		return "updated";
	}
}
