package com.tcs.demo1.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class Service {
  private ArrayList<User> users=new ArrayList<User>(Arrays.asList(new User(1,"rohan","sonipat",8929,"email"),new User(2,"rohan","sonipat",8929,"email")));

  public ArrayList<User> getAllUsers(){
	  return users;
  }
  public User getUser(int id) {
	  for(User i: users) {
		  if(i.getId()==id)
			  return i;
	  }
	  return null;
  }
public void addUser(User user) {
	users.add(user);
	
}
public void deleteUser(int id) {
	users.removeIf(user -> user.getId()==id);
	
}
public void updateUser(String add, int id) {
	
for(User i:users ) {
	if(i.getId()==id) {
		i.setAddress(add);
	}
	
}
	
}
}
