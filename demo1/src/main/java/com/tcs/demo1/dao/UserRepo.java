package com.tcs.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcs.demo1.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	@Modifying
    @Query("Update User u Set u.address=:s Where u.id=:id")
    public void update_address(@Param("s") String s,@Param("id") Integer id);
}
