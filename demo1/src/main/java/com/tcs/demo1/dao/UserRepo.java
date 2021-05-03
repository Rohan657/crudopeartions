package com.tcs.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tcs.demo1.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	
}
